package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * deposit 存款
 */
public class Deposit extends Base{

	public String id;			//存款id
	public String currency_id;	//币种id
	public Double money;		//金额
	public String ptype_id;		//存款类型id
	public String sequence_id;	//序列号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getPtype_id() {
		return ptype_id;
	}
	public void setPtype_id(String ptype_id) {
		this.ptype_id = ptype_id;
	}
	public String getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}
	public Deposit(String id, String currency_id, Double money, String ptype_id, String sequence_id) {
		super();
		this.id = id;
		this.currency_id = currency_id;
		this.money = money;
		this.ptype_id = ptype_id;
		this.sequence_id = sequence_id;
	}
	
	public Deposit() {
		// TODO Auto-generated constructor stub
	}
}
