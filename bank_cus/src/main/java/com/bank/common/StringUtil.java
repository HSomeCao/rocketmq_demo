package com.bank.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringUtil {

	public static String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
	public static final String PLUS = "plus";
	public static final String MINUS = "minus";

	public static String secondDate(Long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日 HH:mm");
		SimpleDateFormat tsdf = new SimpleDateFormat("今天 HH:mm");
		String stringTime = "";
		if ((System.currentTimeMillis() / 1000) - time < 86400) {
			stringTime = tsdf.format(new Date(time * 1000));
		} else {
			stringTime = sdf.format(new Date(time * 1000));
		}
		return stringTime;
	}

	public static String secondDateyyyy_MM_dd(Long time, boolean change) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date(time * 1000));
		if (date.equals(sdf.format(new Date())) && change) {
			return "今天";
		} else {
			return date;
		}
	}

	public static String secondDateyyyyMMddHHmm(Long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm");
		return sdf.format(new Date(time * 1000));
	}

	public static String secondDateyyyy_MM_dd(Date time, boolean change) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(time);
		if (date.equals(sdf.format(new Date())) && change) {
			return "今天";
		} else {
			return date;
		}
	}
	
	public static String secondDateHH_mm_ss(Long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(new Date(time * 1000));
	}
	
	public static String secondDateyyyy_MM_dd_HH_mm_ss(Long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date(time * 1000));
	}

	public static String secondDateHH_mm_ss(Date time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(time);
	}

	public static String dateWeek(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int num = cal.get(Calendar.DAY_OF_WEEK);
		if (num == 0) {
			num++;
		}
		return weekDays[num - 1];
	}

	public static String plusAndMinusHH_mm_ss(Date time1, Date time2, String type) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String date1 = sdf.format(time1);
		String date2 = sdf.format(time2);
		String[] d1 = date1.split(":");
		String[] d2 = date2.split(":");
		Integer[] d = new Integer[3];
		int day = 0;
		int s1 = Integer.parseInt(d1[2]);
		int s2 = Integer.parseInt(d2[2]);
		int m1 = Integer.parseInt(d1[1]);
		int m2 = Integer.parseInt(d2[1]);
		int h1 = Integer.parseInt(d1[0]);
		int h2 = Integer.parseInt(d2[0]);
		if (PLUS.equals(type)) {
			d[2] = s1 + s2;
			d[1] = m1 = m2;
			d[0] = h1 + h2;
			if (d[2] > 60) {
				d[2] -= 60;
				d[1] += 1;
			}
			if (d[1] > 60) {
				d[1] -= 60;
				d[0] += 1;
			}
			if (d[0] > 24) {
				d[0] -= 24;
				day += 1;
			}
		} else if (MINUS.equals(type)) {
			d[2] = s1 - s2;
			d[1] = m1 - m2;
			d[0] = h1 - h2;

			if (d[2] < 0) {
				d[2] += 60;
				d[1] -= 1;
			}
			if (d[1] < 0) {
				d[1] += 60;
				d[0] -= 1;
			}
			if (d[0] < 0) {
				return null;
			}
		} else {
			return null;
		}
		return day + "天" + d[0] + "小时" + d[1] + "分" + d[2] + "秒";
	}
}
