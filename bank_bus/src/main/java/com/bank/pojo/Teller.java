/**
 * 
 */
package com.bank.pojo;

/**
 * @author admin
 * 2019年4月26日
 * teller 柜员表
 */
public class Teller extends Base{

	public String id;				//柜员id
	public Integer age;				//柜员年龄
	public String sex;				//柜员性别
	public String phone;			//手机号码
	public String username;			//姓名
	public String address;			//住址
	public String idnumber;			//身份证号码
	public String status;			//状态
	public String position;			//职位
	public String bank_id;			//所属银行
	public String password;			//密码
	public String salt;				//盐
	public String regtime;			//注册时间
	public String last_login_time;	//最后登录时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}
	public Teller(String id, Integer age, String sex, String phone, String username, String address, String idnumber,
			String status, String position, String bank_id, String password, String salt, String regtime,
			String last_login_time) {
		super();
		this.id = id;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.username = username;
		this.address = address;
		this.idnumber = idnumber;
		this.status = status;
		this.position = position;
		this.bank_id = bank_id;
		this.password = password;
		this.salt = salt;
		this.regtime = regtime;
		this.last_login_time = last_login_time;
	}
	
	/**
	 * 
	 */
	public Teller() {
		// TODO Auto-generated constructor stub
	}
}
