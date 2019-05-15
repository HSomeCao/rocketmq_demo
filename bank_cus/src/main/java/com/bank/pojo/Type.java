/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * type 银行卡类型表
 */
public class Type extends Base{

	public String id;		//银行卡类型id
	public String name;		//卡类型
	public String msg;		//备注说明
	public Integer number;	//数量
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Type(String id, String name, String msg, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.msg = msg;
		this.number = number;
	}
	
	/**
	 * 
	 */
	public Type() {
		// TODO Auto-generated constructor stub
	}
	 
}
