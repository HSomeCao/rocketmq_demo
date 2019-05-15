/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * id_type 证件类型编号
 */
public class IdType extends Base{
	public String id;		//证件类型编号id
	public String type;		//证件类型名称
	
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
	
	public IdType(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	/**
	 * 
	 */
	public IdType() {
		// TODO Auto-generated constructor stub
	}
}
