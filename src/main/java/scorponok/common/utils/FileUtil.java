package scorponok.common.utils;

import java.io.File;

public class FileUtil {
	/**
	 * user: ssj date: 2018年01月08日 上午13:20:04
	 * 
	 * @param dir
	 *            void 判断路径是否存在，如果不存在则创建
	 */
	public static void mkdirs(String dir) {
		if (StringUtil.isEmpty(dir)) {
			return;
		}

		File file = new File(dir);
		if (file.isDirectory()) {
			return;
		} else {
			file.mkdirs();
		}
	}
}
