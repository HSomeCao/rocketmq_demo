package com.bank.common.info;

public class Messages<T> {

	private Boolean result;

	private String msg;
	
	private Boolean login;
	
	private T pojo;

	public Messages(Boolean re, String msg) {
		this.result = re;
		this.msg = msg;
	}
	
	public Messages(Boolean re, String msg,T pojo) {
		this.result = re;
		this.msg = msg;
		this.pojo=pojo;
	}
	
	public Messages(Boolean re, Boolean login) {
		this.result = re;
		this.login=login;
		if(!login) {
			msg="用户未登陆";
		}
	}
	

	public Boolean getLogin() {
		return login;
	}

	public void setLogin(Boolean login) {
		this.login = login;
	}

	public Messages() {
	}

	
	public T getPojo() {
		return pojo;
	}

	public void setPojo(T pojo) {
		this.pojo = pojo;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}	

}
