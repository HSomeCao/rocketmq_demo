/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * card 银行卡表
 */
public class Card extends Base{

	public String id;	//银行卡id
	public String code;	//卡号
	public Integer character;	//卡性质
	public String type_id;		//卡类型id
	public String customer_id;	//客户id
	public String creat_time;	//开卡时间
	public Integer flag;		//通兑标志
	public Integer isagency;	//是否代理
	public Integer grade;		//账户等级（一二三类账户）
	public String password;		//卡密码
	public Integer status;		//帐户状态
	public String salt;			//盐
	public String dealpwd;		//交易密码
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getCharacter() {
		return character;
	}
	public void setCharacter(Integer character) {
		this.character = character;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCreat_time() {
		return creat_time;
	}
	public void setCreat_time(String creat_time) {
		this.creat_time = creat_time;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Integer getIsagency() {
		return isagency;
	}
	public void setIsagency(Integer isagency) {
		this.isagency = isagency;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getDealpwd() {
		return dealpwd;
	}
	public void setDealpwd(String dealpwd) {
		this.dealpwd = dealpwd;
	}
	public Card(String id, String code, Integer character, String type_id, String customer_id, String creat_time,
			Integer flag, Integer isagency, Integer grade, String password, Integer status, String salt,
			String dealpwd) {
		super();
		this.id = id;
		this.code = code;
		this.character = character;
		this.type_id = type_id;
		this.customer_id = customer_id;
		this.creat_time = creat_time;
		this.flag = flag;
		this.isagency = isagency;
		this.grade = grade;
		this.password = password;
		this.status = status;
		this.salt = salt;
		this.dealpwd = dealpwd;
	}
	
	/**
	 * 
	 */
	public Card() {
		// TODO Auto-generated constructor stub
	}
}
