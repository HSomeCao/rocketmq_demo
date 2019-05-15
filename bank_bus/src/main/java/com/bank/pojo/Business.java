package com.bank.pojo;
/**
 * 业务类型表
 * @author admin
 *	business
 */
public class Business extends Base{

	public String id;		//业务类型编号
	public String name;		//交易类型
	public String number;	//交易编号
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Business(String id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public Business() {
		// TODO Auto-generated constructor stub
	}
	
}

