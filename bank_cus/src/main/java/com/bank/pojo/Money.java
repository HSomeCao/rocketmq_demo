/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * money 余额
 */
public class Money extends Base{
	public String id;		//余额id
	public String card_id;			//卡 id
	public String currency_id;		//币种 id
	public String type;				//存款类型
	public Integer money;			//余额
	public String expire_time;		//到期时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	public String getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(String currency_id) {
		this.currency_id = currency_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getExpire_time() {
		return expire_time;
	}
	public void setExpire_time(String expire_time) {
		this.expire_time = expire_time;
	}
	
	/**
	 * 
	 */
	public Money() {
		// TODO Auto-generated constructor stub
	}
	public Money(String id, String card_id, String currency_id, String type, Integer money, String expire_time) {
		super();
		this.id = id;
		this.card_id = card_id;
		this.currency_id = currency_id;
		this.type = type;
		this.money = money;
		this.expire_time = expire_time;
	}
}
