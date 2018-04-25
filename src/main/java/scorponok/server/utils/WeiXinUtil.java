package scorponok.server.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class WeiXinUtil {
	protected static final Log logger = LogFactory.getLog(WeiXinUtil.class);

	public static String getPostMessage(HttpServletRequest request) {
		try {
			ServletInputStream inputStream = request.getInputStream();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buff = new byte[256];
			int offset = 0;
			while ((offset = inputStream.read(buff)) != -1) {
				out.write(buff, 0, offset);
			}
			String message = out.toString("UTF-8");
			out.close();
			inputStream.close();
			return message;
		} catch (IOException e) {
			return "";
		}
	}

	public static Map<String, String> parserMsg(String msg) {
		Map<String, String> message = new HashMap<String, String>();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			StringReader sr = new StringReader(msg);
			InputSource is = new InputSource(sr);
			Document document = db.parse(is);
			Element root = document.getDocumentElement();
			NodeList childNodes = root.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node item = childNodes.item(i);
				String nodeName = item.getNodeName();
				Node child = item.getFirstChild();
				if (child == null) {
					continue;
				}
				String nodeValue = child.getNodeValue();
				message.put(nodeName, nodeValue);
			}
			return message;
		} catch (Exception e) {
			e.printStackTrace();
			return message;
		}
	}

	//
	// public static Account assemblyAccount(User user) {
	// Account account = new Account();
	// try {
	// account.setOpenid(user.getOpenid());
	// account.setWxname(user.getNickname());
	// account.setCity(user.getCity());
	// account.setHeadimgurl(user.getHeadimgurl());
	// } catch (Exception e) {
	// logger.info(e);
	// }
	// return account;
	// }
}
