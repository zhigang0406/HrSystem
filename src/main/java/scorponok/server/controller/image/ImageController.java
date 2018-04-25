package scorponok.server.controller.image;

import com.aliyun.oss.OSSClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import scorponok.common.exception.BusinessException;
import scorponok.common.exception.ErrorConstant;
import scorponok.common.utils.JsonUtil;
import scorponok.common.utils.StringUtil;
import scorponok.server.response.UploadResponse;
import scorponok.server.utils.FileUtil;

import javax.annotation.PostConstruct;
import javax.imageio.*;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.*;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Controller
public class ImageController {

	protected final Log logger = LogFactory.getLog(getClass());
	private static final String endpoint = "oss-cn-hangzhou.aliyuncs.com";
	private static final String accessKeyId = "LTAIGQmaxx7hyP0P";
	private static final String accessKeySecret = "VJBXBr3cwiKQnTUrEWfSg9LWN0TcLL";
	private static final Long SIZE_300KB = 314572L;
	private static final String BUCHKT_NAME = "dxjk";
	private static final String URL = "https://dxjk.oss-cn-hangzhou.aliyuncs.com/";
	// 创建OSSClient实例
	private OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
	@Value("${resource_temp_path}") private String resourceTempPath;

	@PostConstruct public void init() {
		File tempPath = new File(resourceTempPath);
		if (tempPath.exists() == false) {
			tempPath.mkdir();
		}
	}

	private ThreadPoolExecutor excuter = new ThreadPoolExecutor(1, 10, 1000, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<Runnable>(10),
			new ThreadPoolExecutor.CallerRunsPolicy());

	public UploadResponse uploadImg(MultipartFile file, int resType, String resId) {
		UploadResponse response = new UploadResponse();
		try {
			return uploadImg(file.getBytes(), resType, resId);
		} catch (IOException e) {
			throw new BusinessException(ErrorConstant.RESOURCE_UPLOAD_ERROR);
		}
	}

	@RequestMapping(value = "uploadImg.up", method = RequestMethod.POST) @ResponseBody
    public String uploadImage(
            @RequestParam(value = "file", required = false) MultipartFile file, @RequestParam("resType") int resType,
            @RequestParam(value = "resId", required = false) String resId, HttpServletResponse res) {
		res.setHeader("Access-Control-Allow-Origin", "*");
		return JsonUtil.toJson(uploadImg(file, resType, resId));
	}

	public UploadResponse uploadImg(byte[] file, int resType, String resId) throws IOException {
		UploadResponse response = new UploadResponse();
		long size = file.length;
		InputStream in = null;
		try {
			in = new ByteArrayInputStream(file);
			// InputStream resizeIn = null;
			String tair = null;
			switch (resType) {
			case 1:
				tair = ".jpg";
				if (size > SIZE_300KB) {
					in = zipImg(convertToJpg(file));
				}
				// resizeIn = resize(new ByteArrayInputStream(file), 320, 320);
				break;
			case 2:
				tair = ".wav";
				break;
			case 3:
				tair = ".js";
				break;
			case 4:
				tair = ".css";
				break;
			default:
				throw new BusinessException(ErrorConstant.RES_TYPE_DENY);
			}
			if (resId == null) {
				resId = StringUtil.getToken(20) + tair;
			}

			String fileName = saveFile(in, resId);
			// if (resizeIn != null) {
			// String thumbFile = saveFile(resizeIn, "thumb_" + resId);
			// excuter.execute(new UploadJob("thumb_" + resId, thumbFile));
			// }
			excuter.execute(new UploadJob(resId, fileName));
			response.setOssAddress(URL + resId);
			return response;

		}  finally {
			try {
				in.close();
			} catch (IOException e) {
			}
		}
	}

	private static InputStream convertToJpg(byte[] file) throws IOException {
		BufferedImage read = ImageIO.read(new ByteArrayInputStream(file));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		BufferedImage jpgImg = new BufferedImage(read.getWidth(), read.getHeight(), BufferedImage.TYPE_INT_RGB);
		jpgImg.createGraphics().drawImage(read, 0, 0, Color.WHITE, null);
		ImageIO.write(jpgImg, "jpg", out);
		return new ByteArrayInputStream(out.toByteArray());
	}

	public UploadResponse uploadImg(long userId, MultipartFile file, int resType, UploadResponse response) {
		try {
			return uploadImg(file.getBytes(), resType, null);
		} catch (IOException e) {
			throw new BusinessException(ErrorConstant.RESOURCE_UPLOAD_ERROR);
		}
	}

	private class UploadJob implements Runnable {
		private String resId;
		private String fileName;

		public UploadJob(String resId, String fileName) {
			super();
			this.resId = resId;
			this.fileName = fileName;
		}

		@Override public void run() {
			try {
				File file = new File(fileName);
				ossClient.putObject(BUCHKT_NAME, resId, file);
				// file.delete();
				logger.info("upload res success : " + resId);
			} catch (Exception e) {
				logger.error("upload oss error", e);
			}
		}
	}

	private String saveFile(InputStream in, String resId) throws IOException {
		String file = resourceTempPath + File.separator + resId;
		FileUtil.writeFile(file, in);
		return file;
	}

	@RequestMapping("res.htm") public String getResource(@RequestParam("resId") String resId) {
		Date expiration = new Date(new Date().getTime() + 3600 * 1000);
		URL url = ossClient.generatePresignedUrl(BUCHKT_NAME, resId, expiration);
		return "redirect:" + url.toString();
	}

	public String getResourceURL(String resId) {
		Date expiration = new Date(new Date().getTime() + 3600 * 1000);
		URL url = ossClient.generatePresignedUrl(BUCHKT_NAME, resId, expiration);
		return url.toString();
	}

	private static ByteArrayInputStream resize(InputStream stream, int w, int h) throws IOException {
		Image img = ImageIO.read(stream);
		BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		g.drawImage(img, 0, 0, w, h, Color.LIGHT_GRAY, null);
		g.dispose();
		// 将图片保存在原目录并加上前缀
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ImageIO.write(bi, "jpg", out);
		return new ByteArrayInputStream(out.toByteArray());
	}

	private static InputStream zipImg(InputStream stream){
		try {
			BufferedImage read = ImageIO.read(stream);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			// 得到指定Format图片的writer
			Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName("jpeg");// 得到迭代器
			ImageWriter writer = (ImageWriter) iter.next(); // 得到writer

			// 得到指定writer的输出参数设置(ImageWriteParam )
			ImageWriteParam iwp = writer.getDefaultWriteParam();
			iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT); // 设置可否压缩
			iwp.setCompressionQuality(0.3f); // 设置压缩质量参数

			iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);
			ColorModel colorModel = ColorModel.getRGBdefault();
			// 指定压缩时使用的色彩模式
			iwp.setDestinationType(new ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(16, 16)));

			// 开始打包图片，写入byte[]
			IIOImage iIamge = new IIOImage(read, null, null);
			// 此处因为ImageWriter中用来接收write信息的output要求必须是ImageOutput
			// 通过ImageIo中的静态方法，得到byteArrayOutputStream的ImageOutput
			writer.setOutput(ImageIO.createImageOutputStream(out));
			writer.write(null, iIamge, iwp);
			return new ByteArrayInputStream(out.toByteArray());
		} catch (IOException e) {
			throw new BusinessException(ErrorConstant.IMG_ZIP_ERROR);
		}
	}

}
