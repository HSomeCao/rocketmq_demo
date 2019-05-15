/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * 	跨行  inter_bank
 */
public class InterBank extends Base{

	public String id;		//跨行id
	public String name;		//名称
	public Integer number;	//编号
	public Double rate;		//手续费比例
	public Integer least;	//最低转账金额
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Integer getLeast() {
		return least;
	}
	public void setLeast(Integer least) {
		this.least = least;
	}

	/**
	 * 
	 */
	public InterBank() {
		// TODO Auto-generated constructor stub
	}
	public InterBank(String id, String name, Integer number, Double rate, Integer least) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.rate = rate;
		this.least = least;
	}
	
}
