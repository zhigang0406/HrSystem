package scorponok.common.utils;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class StringUtil {
	private static final String TOKEN = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final String SPLIT = "-";
	private static final String NUMBER_TOKEN = "1234567890";

	public static int getNumberUnin(int size) {
		if (size > 10) {
			throw new RuntimeException("size > 10");
		}
		Set<Character> dupCheck = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		while (sb.length() < size) {
			char charAt = NUMBER_TOKEN.charAt(random.nextInt(NUMBER_TOKEN.length()));
			if (dupCheck.contains(charAt)) {
				continue;
			} else {
				dupCheck.add(charAt);
				sb.append(charAt);
			}
		}
		return Integer.valueOf(sb.toString());
	}

	public static String getNumberToken(int size) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			sb.append(NUMBER_TOKEN.charAt(random.nextInt(NUMBER_TOKEN.length())));
		}
		return sb.toString();
	}

	public static long buildSessionId(long sendId, long reciveId) {
		if (sendId > reciveId) {
			return Long.valueOf(String.valueOf(reciveId) + String.valueOf(sendId));
		} else {
			return Long.valueOf(String.valueOf(sendId) + String.valueOf(reciveId));
		}
	}

	public static String getToken(int size) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			sb.append(TOKEN.charAt(random.nextInt(TOKEN.length())));
		}
		return sb.toString();
	}

	public static String getBillId() {
		return DateUtil.formatDate(new Date(), "yyyyMMddHHmmssS") + getNumberToken(3);
	}

	public static boolean isEmpty(String account) {
		return account == null || "".equals(account.trim());
	}

	public static boolean isNotEmpty(String userName) {
		return !isEmpty(userName);
	}

	public static boolean isEmpty(Long account) {
		return account == null || account == 0L;
	}

	public static boolean isNotEmpty(Long account) {
		return !isEmpty(account);
	}

	public static boolean isEmpty(Integer account) {
		return account == null || account == 0;
	}

	public static boolean isEmpty(Double account) {
		return account == null || account == 0.0;
	}

}
