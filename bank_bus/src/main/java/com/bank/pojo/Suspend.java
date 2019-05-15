/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * suspend 挂失
 */
public class Suspend extends Base{


	public String id;			//挂失编号
	public String losstype;		//挂式类型
	public String losschannel;	//挂失渠道
	public String phone;		//手机号码
	public String agent;		//代理人
	public String agent_idtype;	//代理人证件类型
	public String agent_number;	//代理人证件号码
	public String cause;		//挂失原因
	public String sequence_id;	//序列号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLosstype() {
		return losstype;
	}
	public void setLosstype(String losstype) {
		this.losstype = losstype;
	}
	public String getLosschannel() {
		return losschannel;
	}
	public void setLosschannel(String losschannel) {
		this.losschannel = losschannel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getAgent_idtype() {
		return agent_idtype;
	}
	public void setAgent_idtype(String agent_idtype) {
		this.agent_idtype = agent_idtype;
	}
	public String getAgent_number() {
		return agent_number;
	}
	public void setAgent_number(String agent_number) {
		this.agent_number = agent_number;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}
	public Suspend(String id, String losstype, String losschannel, String phone, String agent, String agent_idtype,
			String agent_number, String cause, String sequence_id) {
		super();
		this.id = id;
		this.losstype = losstype;
		this.losschannel = losschannel;
		this.phone = phone;
		this.agent = agent;
		this.agent_idtype = agent_idtype;
		this.agent_number = agent_number;
		this.cause = cause;
		this.sequence_id = sequence_id;
	}
	
	/**
	 * 
	 */
	public Suspend() {
		// TODO Auto-generated constructor stub
	}

}
