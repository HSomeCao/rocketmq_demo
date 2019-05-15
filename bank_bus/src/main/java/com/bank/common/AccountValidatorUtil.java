package com.bank.common;

import java.util.regex.Pattern;
/**
 * 账户相关属性验证工具
 *
 */
public class AccountValidatorUtil {
    
    public static final String REGEX_ALLNUMBER = "^[0-9]+$";//纯数字
    
    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "^\\w{6,20}$";
 
    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$";
 
    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
 
    /**
     * 正则表达式：验证汉字 
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5]+$";
 
    /**
     * 正则表达式：验证身份证
     */
    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
 
    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
 
    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
    										
    /*
     * 汉字、字母、数字
     */
    public static final String REGEX_NOT_SPECIAL="^[\\u4E00-\\u9FA5A-Za-z0-9]+$";
 
    
    /**
     * 校验用户名
     * 
     * @return 是否为全数字
     */
    public static boolean allNumber(String username) {
        return Pattern.matches(REGEX_ALLNUMBER, username);
    }
    
    /**
     * 校验用户名
     * 
     * @return 是否无特殊字符
     */
    public static boolean notSpecial(String username) {
        return Pattern.matches(REGEX_NOT_SPECIAL,username);
    }

   
    /**
     * 校验密码
     * 
     * @return 是否为6--20数字字母下划线
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }
 
    /**
     * 校验手机号
     * 
     * @return 是否为手机号
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }
 
    /**
     * 校验邮箱
     * 
     * @return 是否为邮箱号
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
 
    /**
     * 校验汉字
     * 
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }
 
    /**
     * 校验身份证
     * 
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }
 
    /**
     * 校验URL
     * 
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }
 
    /**
     * 校验IP地址
     * 
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }
}