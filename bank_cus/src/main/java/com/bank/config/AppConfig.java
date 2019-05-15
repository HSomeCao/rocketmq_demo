package com.bank.config;

public class AppConfig {
	public static String getApp() {
		return "cus";
	}

	public static String getCID() {
		return "10001";
	}

	public static String getCID(String userid) {
		return AppConfig.getCID(null);
	}

}