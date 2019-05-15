package com.bank.config;

import org.apache.commons.lang3.StringUtils;

public class CidAuth{
	
	private static String whereCid;
	
	private static String getCid(){
		whereCid =" cid in ('00001') ";
		return whereCid;
	}
	
	public static String whereCid(String where) {
		if(StringUtils.isBlank(where)) {
			return whereCid();
		}else {
			return " ( "+where+" ) and "+getCid();
		}
	}
	
	public static String whereCid() {		
		return getCid();		
	}
	
	public static String cid() {
		return "00001";		
	}
}
