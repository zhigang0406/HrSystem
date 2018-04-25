package scorponok.server.utils;

import java.util.Calendar;

public class SSJutils {
	/*
	 * 根据身份证返回年龄
	 */

	public static int getAge(String IDCardNum) {
		Calendar cal1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		cal1.set(Integer.parseInt(IDCardNum.substring(6, 10)), Integer.parseInt(IDCardNum.substring(10, 12)),
				Integer.parseInt(IDCardNum.substring(12, 14)));
		return getYearDiff(today, cal1);
	}

	static int getYearDiff(Calendar cal, Calendar cal1) {
		int m = (cal.get(cal.MONTH)) - (cal1.get(cal1.MONTH));
		int y = (cal.get(cal.YEAR)) - (cal1.get(cal1.YEAR));
		return (y * 12 + m) / 12;
	}

	public static void main(String[] args) {
		int age = getAge("3306831995051100XX");
		System.out.println(age);
	}
}