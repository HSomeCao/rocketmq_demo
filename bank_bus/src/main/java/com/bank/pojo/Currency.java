/**
 * 
 */
package com.bank.pojo;

/**
 * 
 * @author admin
 * 2019年4月26日
 *  币种表  currency
 */
public class Currency extends Base{

	public String id;		//币种表
	public String type;		//币种类型
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
	public Currency(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	public Currency() {
		// TODO Auto-generated constructor stub
	}
	
}
