package com.bank.config;

public class AppConfig {
	public static String getApp() {
		return "bus";
	}

	public static String getCID() {
		return "10002";
	}

	public static String getCID(String userid) {
		return AppConfig.getCID(null);
	}

}