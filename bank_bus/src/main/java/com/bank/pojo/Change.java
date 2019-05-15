package com.bank.pojo;

/**
 * 换卡表
 * @author admin
 *	change
 */
public class Change extends Base{

	public String id;			//换卡表id
	public String old_card;		//旧卡号
	public String new_card;		//新卡号
	public String sequence_id;	//序列号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOld_card() {
		return old_card;
	}
	public void setOld_card(String old_card) {
		this.old_card = old_card;
	}
	public String getNew_card() {
		return new_card;
	}
	public void setNew_card(String new_card) {
		this.new_card = new_card;
	}
	public String getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(String sequence_id) {
		this.sequence_id = sequence_id;
	}
	
	
	
}
