/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * drawmoney 取钱
 */
public class Drawmoney extends Base{

	public String id;			//取钱id
	public String order_id;		//预约编号
	public String currency_id;	//币种
	public String sequence_id;	//交易流水表id
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}
	public String getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}
	public Drawmoney(String id, String order_id, String currency_id, String sequence_id) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.currency_id = currency_id;
		this.sequence_id = sequence_id;
	}
	
	/**
	 * 
	 */
	public Drawmoney() {
		// TODO Auto-generated constructor stub
	}

}
