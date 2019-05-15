package com.bank.pojo;

/**
 * 	转账 transfer
 * @author admin
 * 2019年4月26日
 */
public class Transfer extends Base{

	public String id;			//转账id
	public String currency_id;	//币种id
	public Double money;		//金额
	public String cardnumber;	//对方账户
	public String way;			//到账方式
	public Double charge;		//手续费
	public String idtype_id;	//对方证件类型
	public String idnumber;		//对方身份账号
	public String othername;	//对方姓名
	public String msg;			//备注
	public String sequence_id;	//序列号
	public String inter_number;	//跨行编号
	
	
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
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public Double getCharge() {
		return charge;
	}
	public void setCharge(Double charge) {
		this.charge = charge;
	}
	public String getIdtype_id() {
		return idtype_id;
	}
	public void setIdtype_id(String idtype_id) {
		this.idtype_id = idtype_id;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getOthername() {
		return othername;
	}
	public void setOthername(String othername) {
		this.othername = othername;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}
	public String getInter_number() {
		return inter_number;
	}
	public void setInter_number(String inter_number) {
		this.inter_number = inter_number;
	}
	
	public Transfer() {
		// TODO Auto-generated constructor stub
	}
	public Transfer(String id, String currency_id, Double money, String cardnumber, String way, Double charge,
			String idtype_id, String idnumber, String othername, String msg, String sequence_id, String inter_number) {
		super();
		this.id = id;
		this.currency_id = currency_id;
		this.money = money;
		this.cardnumber = cardnumber;
		this.way = way;
		this.charge = charge;
		this.idtype_id = idtype_id;
		this.idnumber = idnumber;
		this.othername = othername;
		this.msg = msg;
		this.sequence_id = sequence_id;
		this.inter_number = inter_number;
	}
	
}
