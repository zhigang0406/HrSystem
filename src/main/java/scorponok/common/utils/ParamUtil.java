package scorponok.common.utils;


import scorponok.common.exception.BusinessException;
import scorponok.common.exception.ErrorConstant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class ParamUtil {

	private static final String[] DICTIONARY = new String[] {
			"ce1Xoul9G0mVwfAnkY27pzHTvhINtOySB5gKbrQPixjCDU436WJFERdqL8saZM",
			"EsiKmn0LYpayNThZ5HPfk1zrgubU6Sc7v8FBJ3lOI4xAdCtwGXRqVM9oQjD2We",
			"8IG9woU32mYkzT04RHN7S1PAFQEcjanWqfyxsebCVOXDgvpKZihBltdLMuJ65r",
			"9ykHmEdV1sge0vaTbZriQo4AIDMKqJPhu3p8lnR5zLCSx27XfFW6tjOGBcwYUN",
			"jkMcZVhJPu8Crx91E4ObylKqQoz5YaXiNDU2HB6eAvwmfRt0n3GgWSFs7dLIpT",
			"y6210QWlUKsuFmc937wghjiSoG5ONTbVqLtfxdnYeZrXDAJzBpa8vHPR4kIEMC",
			"D1nuyqaskc9QMNLgJTdGofCYbPZHrvRIj0W4OKl7UFpm5twSXi3zAEh2Vex86B",
			"XLCYP41MAhEtzkBjn0VHq7esIbRSQavxDdyuZFoc5l8OpN3GwUg9m6W2irJTKf",
			"uxBKRSsgQar0kj1fhNiymCFTn4o23lvpG8IqELUAMXWZPDJVweYO56Hzt9db7c",
			"P8vCLaGHKnfUBirgoJ4Rl2hZwX9eWkQT63sNE01mYMD5pIzy7cbVSAdjFquOtx" };
	private static final int UNIT = 2;
	private static final int DIC_SIZE = 62;
	private static ThreadLocal<Random> random = new ThreadLocal<Random>() {
		protected Random initialValue() {
			return new Random();
		}

		;
	};

	private static void encodeBody(long body, StringBuilder sb, boolean hasSum, int dic) {
		int ti = 0;
		boolean end = false;
		Stack<Integer> subNumber = new Stack<Integer>();
		do {
			if (body < 10) {
				end = true;
			}
			int wei = (int) (body % 10);
			body = body / 10;
			ti += wei;
			subNumber.push(wei);
		} while (end == false);

		while (subNumber.isEmpty() == false) {
			sb.append(encodeNumber(subNumber.pop(), dic));
		}
		if (hasSum) {
			ti = ti % 100;
			sb.append(encodeNumber(ti / 10, dic));
			sb.append(encodeNumber(ti % 10, dic));
		}
	}

	private static String encodeNumber(int number, int dic) {
		int[] result = new int[UNIT];

		int main = random.get().nextInt(DIC_SIZE - number) + number;
		result[0] = main;
		int sub = main - number;
		for (int i = 1; i < UNIT - 1; i++) {
			if (sub == 0) {
				break;
			}
			int offset = random.get().nextInt(sub);
			sub -= offset;
			result[i] = offset;
		}
		result[UNIT - 1] = sub;
		StringBuilder sb = new StringBuilder();
		for (int i : result) {
			sb.append(DICTIONARY[dic].charAt(i));
		}
		return sb.toString();
	}

	private static int decodeNumber(String param, int dic) {
		char[] charArray = param.toCharArray();
		int main = DICTIONARY[dic].indexOf(charArray[0]);
		for (int i = 1; i < charArray.length; i++) {
			main -= DICTIONARY[dic].indexOf(charArray[i]);
		}
		return main;
	}

	private static String decodeBody(char[] param, int start, int end, int dic) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i < end; i += UNIT) {
			int number = decodeNumber(String.copyValueOf(param, i, UNIT), dic);
			if (number < 0) {
				throw new BusinessException(ErrorConstant.FIELD_INVALID);
			}
			sb.append(number);
		}
		return sb.toString();
	}

	public static long decode(String param) {
		return decode(param, true);
	}

	public static long decode(String param, boolean hasTair) {
		char[] charArray = param.toCharArray();
		int end = charArray.length;
		if (hasTair) {
			end = end - 2 * UNIT;
		}
		int start = UNIT;
		int dic = Integer.valueOf(decodeBody(charArray, 0, start, 0));

		String body = decodeBody(charArray, start, end, dic);
		int ti = 0;
		char[] bodyChar = body.toCharArray();
		for (char c : bodyChar) {
			ti += Integer.valueOf(c + "");
		}
		if (hasTair) {
			String pTair = decodeBody(charArray, end, charArray.length, dic);
			ti = ti % 100;
			if (Integer.valueOf(pTair).equals(ti) == false) {
				throw new BusinessException(ErrorConstant.FIELD_INVALID);
			}
		}
		Long value = Long.valueOf(body);
		return value;
	}

	public static String encode(long id) {
		return encode(id, true);
	}

	public static String encode(long id, boolean hasTair) {
		StringBuilder sb = new StringBuilder();
		int dic = random.get().nextInt(10);
		encodeBody(dic, sb, false, 0);
		encodeBody(id, sb, hasTair, dic);
		return sb.toString();
	}

	private static String createDictoinary() {
		List<Character> charList = new ArrayList<Character>();
		for (int i = 48; i <= 57; i++) {
			charList.add((char) i);
		}
		for (int i = 65; i <= 90; i++) {
			charList.add((char) i);
		}
		for (int i = 97; i <= 122; i++) {
			charList.add((char) i);
		}
		StringBuilder sb = new StringBuilder();

		while (charList.size() > 0) {
			int index = random.get().nextInt(charList.size());
			sb.append(charList.get(index));
			charList.remove(index);
		}

		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(encode(3001));
		System.out.println(decode("TzgXzYvvmo"));
		String encode = encode(274);
		// System.out.println(decode("EJ5MPPigiiWP"));
		String string = encode(1);
		System.out.println(encode + "-" + string);
	}
}
