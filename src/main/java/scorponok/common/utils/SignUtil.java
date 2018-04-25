package scorponok.common.utils;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;

public class SignUtil {
	public static final String PUBLIC_ACCESS_KEY = "WmUlJJUGqxmRGU5g";
	public static final String PUBLIC_ACCESS_TOKEN = "Yf5CFSXUuJAM02Ce";

	public static String makeSign(String bizdata, String secretkey) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update((bizdata + secretkey).getBytes("UTF-8"));
			byte[] b = md.digest();
			String sign = Base64.getEncoder().encodeToString(b);
			return sign;
		} catch (Exception e) {
			return "";
		}
	}

	public static String makeSign(String bizdata) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update((bizdata).getBytes("UTF-8"));
			byte[] b = md.digest();
			String sign = Base64.getEncoder().encodeToString(b);
			return sign;
		} catch (Exception e) {
			return "";
		}
	}

	public static String getSHA1(String encodeString) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");

			md.update(encodeString.getBytes());
			byte[] digest = md.digest();

			StringBuffer hexstr = new StringBuffer();
			String shaHex = "";
			for (int i = 0; i < digest.length; i++) {
				shaHex = Integer.toHexString(digest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexstr.append(0);
				}
				hexstr.append(shaHex);
			}
			return hexstr.toString();
		} catch (Exception e) {
			return "";
		}
	}

	public static boolean checkSign(String bizData, String secretkey, String digest) {
		String sign;

		try {
			sign = makeSign(bizData, secretkey);
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
		if (!sign.equals(digest)) {
			return false;
		}
		return true;
	}

	public static RSAPublicKey getPublicKey(String modulus, String exponent) {
		try {
			BigInteger b1 = new BigInteger(modulus);
			BigInteger b2 = new BigInteger(exponent);

			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			RSAPublicKeySpec keySpec = new RSAPublicKeySpec(b1, b2);
			return (RSAPublicKey) keyFactory.generatePublic(keySpec);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String bcd2Str(byte[] bytes) {
		char temp[] = new char[bytes.length * 2], val;

		for (int i = 0; i < bytes.length; i++) {
			val = (char) (((bytes[i] & 0xf0) >> 4) & 0x0f);
			temp[i * 2] = (char) (val > 9 ? val + 'A' - 10 : val + '0');

			val = (char) (bytes[i] & 0x0f);
			temp[i * 2 + 1] = (char) (val > 9 ? val + 'A' - 10 : val + '0');
		}
		return new String(temp);
	}

	private static String[] splitString(String string, int len) {
		int x = string.length() / len;
		int y = string.length() % len;
		int z = 0;
		if (y != 0) {
			z = 1;
		}
		String[] strings = new String[x + z];
		String str = "";
		for (int i = 0; i < x + z; i++) {
			if (i == x + z - 1 && y != 0) {
				str = string.substring(i * len, i * len + y);
			} else {
				str = string.substring(i * len, i * len + len);
			}
			strings[i] = str;
		}
		return strings;
	}
}
