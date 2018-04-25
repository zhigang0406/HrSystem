package scorponok.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	public static final String formateBeginDay = " 00:00:00";

	public static final String formateMonthBeginDay = "-01 00:00:00";

	public static final String formateEndDay = " 23:59:59";

	public static final String formateStr10 = "yyyy-MM-dd";

	public static final String formateStr7 = "yyyy-MM";

	public static final String formatStr5 = "MM-dd";

	public static final String formatStr5M = "HH:mm";

	public static final String formateStr19 = "yyyy-MM-dd HH:mm:ss";

	public static final String formateStr15 = "yyyy-MM-dd HH:mm";

	public static long millSencondPerDay = 24 * 3600 * 1000;

	public static long millSencondPerHours = 60 * 60 * 1000;
	public static long millSencondPerMinutes = 60 * 1000;
	public final static String DATETIME_FORMAT = "dd/MM/yyyy HH:mm";

	public static String getToday() {
		return formatDate(new Date(), formateStr10);
	}

	public static String formatDate(Date date, String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		if (date == null) {
			return "";
		}
		return sdf.format(date);
	}

	public static String formatDateTime(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
		if (date == null) {
			return "";
		}
		return sdf.format(date);
	}

	public static Date parseDate(String str, String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 将date偏移(增加或减少)N天
	 *
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date addDays(Date date, int n) {
		long millSeconds = date.getTime();
		return new Date(millSeconds + n * millSencondPerDay);
	}

	/**
	 * 将date偏移(增加或减少) N小时
	 */
	public static Date addHours(Date date, int n) {
		long millSeconds = date.getTime();
		return new Date(millSeconds + n * millSencondPerHours);
	}

	/**
	 * 将date偏移(增加或减少) N分钟
	 */
	public static Date addMin(Date date, int n) {
		long millSeconds = date.getTime();
		return new Date(millSeconds + n * millSencondPerMinutes);
	}

	/**
	 * 返回一天的起始时间点YYYY-MM-DD 00:00:00
	 *
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date getStartDate(Date date) {
		if (date == null)
			return null;
		String dayStr = formatDate(date, formateStr10);
		String begingDayStr = dayStr + formateBeginDay;
		return parseDate(begingDayStr, formateStr19);

	}

	public static Date getMonthStartDate(Date date) {
		String dayStr = formatDate(date, formateStr7);
		String begingDayStr = dayStr + formateMonthBeginDay;
		return parseDate(begingDayStr, formateStr19);
	}

	/**
	 * 返回偏移n天后的起始时间点YYYY-MM-DD 00:00:00
	 *
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date getStartDate(Date date, int n) {
		Date newDay = addDays(date, n);
		String dayStr = formatDate(newDay, formateStr10);
		String begingDayStr = dayStr + formateBeginDay;
		return parseDate(begingDayStr, formateStr19);

	}

	/**
	 * 返回一天的结束时间点YYYY-MM-DD 23:59:59
	 *
	 * @param date
	 * @return
	 */
	public static Date getEndDate(Date date) {
		if (date == null)
			return null;
		String dayStr = formatDate(date, formateStr10);
		String endDayStr = dayStr + formateEndDay;
		return parseDate(endDayStr, formateStr19);
	}

	/**
	 * 返回偏移n天后的结束时间点YYYY-MM-DD 23:59:59
	 *
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date getEndDate(Date date, int n) {
		Date newDay = addDays(date, n);
		String dayStr = formatDate(newDay, formateStr10);
		String endDayStr = dayStr + formateEndDay;
		return parseDate(endDayStr, formateStr19);
	}

	public static int calculateDifference(Date a, Date b) {
		int tempDifference = 0;
		int difference = 0;
		Calendar earlier = Calendar.getInstance();
		Calendar later = Calendar.getInstance();

		if (a.compareTo(b) < 0) {
			earlier.setTime(a);
			later.setTime(b);
		} else {
			earlier.setTime(b);
			later.setTime(a);
		}

		while (earlier.get(Calendar.YEAR) != later.get(Calendar.YEAR)) {
			tempDifference = 365 * (later.get(Calendar.YEAR) - earlier.get(Calendar.YEAR));
			difference += tempDifference;
			earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
		}

		if (earlier.get(Calendar.DAY_OF_YEAR) != later.get(Calendar.DAY_OF_YEAR)) {
			tempDifference = later.get(Calendar.DAY_OF_YEAR) - earlier.get(Calendar.DAY_OF_YEAR);
			difference += tempDifference;
			earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
		}

		return difference;
	}

	public static Date now() {
		return new Date();
	}

	public static Date todayFrom00() {
		// get today from 00:00
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.DAY_OF_MONTH, ca.get(Calendar.DAY_OF_MONTH) - 1);
		ca.set(Calendar.HOUR, 12);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		return ca.getTime();
	}

	public static int getYear(Date d) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		return cal.get(Calendar.YEAR);
	}

	public static int getMonth(Date d) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		return cal.get(Calendar.MONTH) + 1;
	}

	public static int getDayOfMonth(Date d) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		return cal.get(Calendar.DAY_OF_MONTH);
	}

	public static int getHours(Date d) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	private static final String[] monthDesc = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
			"OCTOBER",
			"NOVEMBER", "DECEMBER" };

	public static String getMonthDesc(Date d) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		return monthDesc[cal.get(Calendar.MONTH)];

	}

	public static String getMonthShortDesc(Date d) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		return monthDesc[cal.get(Calendar.MONTH)].substring(0, 3);

	}

	public static Date toStartOfDay(Date date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 1);
		return cal.getTime();
	}

	public static Date toEndOfDay(Date date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}

	public static Date toMidOfDay(Date date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static boolean isDateAfter(Date date1, Date date2) {
		if (date1.after(date2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDateBefore(Date date1, Date date2) {
		if (date1.before(date2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDateEquals(Date date1, Date date2) {
		if (date1.equals(date2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDayAfter(Date date1, Date date2) {
		date1 = toStartOfDay(date1);
		date2 = toStartOfDay(date2);
		if (date1.after(date2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDayBefore(Date date1, Date date2) {
		date1 = toStartOfDay(date1);
		date2 = toStartOfDay(date2);
		if (date1.before(date2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDayEquals(Date date1, Date date2) {
		date1 = toStartOfDay(date1);
		date2 = toStartOfDay(date2);
		if (date1.equals(date2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isSameDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		boolean isSameMonth = isSameYear && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean isSameDate = isSameMonth && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
		return isSameDate;
	}

	public static String getvalityDate(Date startDate, Date expiryDate) {
		return getvalityDate(null, startDate, expiryDate);
	}

	public static String getvalityDate(String format, Date startDate, Date expiryDate) {
		SimpleDateFormat sdf;
		if (format == null) {
			sdf = new SimpleDateFormat("yy.MM.dd");
		} else {
			sdf = new SimpleDateFormat(format);
		}
		if (startDate == null || expiryDate == null) {
			return "";
		}
		String start = sdf.format(startDate);
		String end = sdf.format(expiryDate);
		return start + "--" + end;

	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		long distance = getDistance(sdf.parse("2017-01-02 00:00:00"), sdf.parse("2017-01-03 00:00:00"));
		System.out.println(distance);
	}

	//参数不区分先后
	/*
	计算Date1 和 DATE2 之间间隔多少天
	 */
	public static long getDistance(Date date1, Date date2) {
		if (date1 != null && date2 != null) {
			long time1 = date1.getTime();
			long time2 = date2.getTime();
			if (time1 >= time2) {
				return (time1 - time2) / millSencondPerDay;
			} else {
				return (time2 - time1) / millSencondPerDay;
			}
		}
		return 0;
	}

	/**
	 * 获得该月第一天
	 *
	 * @param year
	 * @param month
	 * @return
	 */

	public static Date getFirstDayOfMonth() {
		// 获取Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 1);//设置为1号
		//将小时至0
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		//将分钟至0
		calendar.set(Calendar.MINUTE, 0);
		//将秒至0
		calendar.set(Calendar.SECOND, 0);
		//将毫秒至0
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 获得该月最后一天
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getLastDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		//将小时至0
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		//将分钟至0
		calendar.set(Calendar.MINUTE, 0);
		//将秒至0
		calendar.set(Calendar.SECOND, 0);
		//将毫秒至0
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

}
