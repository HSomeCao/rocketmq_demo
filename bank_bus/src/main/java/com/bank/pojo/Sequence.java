/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * sequence 交易流水表
 */
public class Sequence extends Base{
	
	public String id;				//交易流水表id
	public String time;				//交易时间
	public String business_number;	//业务编号
	public String teller_id;		//柜员
	public String card_id;			//卡
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBusiness_number() {
		return business_number;
	}
	public void setBusiness_number(String business_number) {
		this.business_number = business_number;
	}
	public String getTeller_id() {
		return teller_id;
	}
	public void setTeller_id(String teller_id) {
		this.teller_id = teller_id;
	}
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	
	/**
	 * 
	 */
	public Sequence() {
		// TODO Auto-generated constructor stub
	}
	public Sequence(String id, String time, String business_number, String teller_id, String card_id) {
		super();
		this.id = id;
		this.time = time;
		this.business_number = business_number;
		this.teller_id = teller_id;
		this.card_id = card_id;
	}
	
}
