package com.bank.pojo;

/**
 * 预约表
 * @author admin
 * appointment
 */
public class Appointment extends Base{

	public String id;			//预约编号
	public String currency_id;	//币种
	public String app_time;		//预约时间
	public Double sum;			//预约金额
	public String app_phone;	//预约手机号
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
	public String getApp_time() {
		return app_time;
	}
	public void setApp_time(String app_time) {
		this.app_time = app_time;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public String getApp_phone() {
		return app_phone;
	}
	public void setApp_phone(String app_phone) {
		this.app_phone = app_phone;
	}
	public String getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}
	public Appointment(String id, String currency_id, String app_time, Double sum, String app_phone,
			String sequence_id) {
		super();
		this.id = id;
		this.currency_id = currency_id;
		this.app_time = app_time;
		this.sum = sum;
		this.app_phone = app_phone;
		this.sequence_id = sequence_id;
	}
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	
}
