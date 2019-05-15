package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * deposit_type 存款类型
 */
public class DepositType extends Base{

	public String id;		//存款类型id
	public String type;		//存款方式
	public Double rate;		//利率
	public String msg;		//规则说明
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public DepositType(String id, String type, Double rate, String msg) {
		super();
		this.id = id;
		this.type = type;
		this.rate = rate;
		this.msg = msg;
	}
	
	/**
	 * 
	 */
	public DepositType() {
		// TODO Auto-generated constructor stub
	}
}
