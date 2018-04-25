package scorponok.common.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class DESUtil {
	/**
	 * 功能：加密
	 * 
	 * @author 宋立君
	 * @date 2014年07月03日
	 * @param
	 *
	 * @param
	 *
	 * @return String
	 * @throws Exception
	 */
	public static String encrypt(String key, String data) throws Exception {
		byte[] ret = encrypt(key.getBytes(), data.getBytes());
		return new String(BASE64Util.encode(ret));
	}

	/**
	 * 
	 * 功能：解密
	 * 
	 * @author 宋立君
	 * @date 2014年07月03日
	 * @param
	 *
	 * @param
	 *
	 * @return String
	 * @throws Exception
	 */
	public static String decrypt(String key, String data) throws Exception {
		byte[] ret = descrypt(key.getBytes(), BASE64Util.decode(data));
		return new String(ret);
	}

	/**
	 * 加密数据 用生成的密钥加密原始数据
	 * 
	 * @param
	 *
	 * @return byte[]
	 * @author 宋立君
	 * @throws Exception
	 * @date 2014年07月03日
	 */
	private static byte[] encrypt(byte[] key, byte[] data) throws Exception {
		try {
			/** DES算法要求有一个可信任的随机数源 */
			SecureRandom sr = new SecureRandom();
			/** 使用原始密钥数据创建DESKeySpec对象 */
			DESKeySpec dks = new DESKeySpec(key);
			/** 创建一个密钥工厂 */
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			/** Cipher对象实际完成加密操作 */
			Cipher cipher = Cipher.getInstance("DES");
			/** 用密钥初始化Cipher对象 */
			cipher.init(Cipher.ENCRYPT_MODE, keyFactory.generateSecret(dks), sr);
			/** 正式执行加密操作 */
			return cipher.doFinal(data);
		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 * 用密钥解密数据
	 * 
	 * @param
	 *
	 * @return byte[]
	 * @author 宋立君
	 * @throws Exception
	 * @date 2014年07月03日
	 */
	private static byte[] descrypt(byte[] key, byte[] data) throws Exception {
		try {
			/** DES算法要求有一个可信任的随机数源 */
			SecureRandom sr = new SecureRandom();
			/** 使用原始密钥数据创建DESKeySpec对象 */
			DESKeySpec dks = new DESKeySpec(key);
			/** 创建一个密钥工厂 */
			SecretKeyFactory keyFactory = null;
			keyFactory = SecretKeyFactory.getInstance("DES");
			/** Cipher对象实际完成加密操作 */
			Cipher cipher = Cipher.getInstance("DES");
			/** 用密钥初始化Cipher对象 */
			cipher.init(Cipher.DECRYPT_MODE, keyFactory.generateSecret(dks), sr);
			/** 正式执行解密操作 */
			return cipher.doFinal(data);
		} catch (Exception e) {
			throw e;
		}

	}
}
