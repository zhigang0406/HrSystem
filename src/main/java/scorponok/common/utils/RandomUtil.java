package scorponok.common.utils;

import java.util.Random;

public class RandomUtil {
//	public static double nextDouble(final double min, final double max) throws Exception {
//		if (max < min) {
//			throw new Exception("min < max");
//		}
//		if (min == max) {
//			return min;
//		}
//		return min + ((max - min) * new Random().nextDouble());
//	}

	public static int nextInt(final int min, final int max) throws Exception {
		if (max < min) {
			throw new Exception("min < max");
		}
		if (min == max) {
			return min;
		}
		return min + ((max - min) * new Random().nextInt());
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i <= 1111; i++) {
			int max = 22;
			int min = 11;
			System.out.println(nextInt(1,10));
		}
	}
}