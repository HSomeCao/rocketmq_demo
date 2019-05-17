/**
 * 
 */
package com.bank.common.pojo;

/**
 * @author admin
 * 2019年4月26日
 * customer 客户表
 */
public class Customer extends Base{

	public String id;		//客户表id
	public String name;		//姓名
	public String sex;		//性别
	public Integer age;		//年龄
	public String phone;	//手机号码
	public String address;		//家庭住址
	public String idtype_id;	//证件类型
	public String id_code;		//证件号码
	public String company;		//工作单位
	public String telephone;	//座机号码
	public String time;//注册时间
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdtype_id() {
		return idtype_id;
	}
	public void setIdtype_id(String idtype_id) {
		this.idtype_id = idtype_id;
	}
	public String getId_code() {
		return id_code;
	}
	public void setId_code(String id_code) {
		this.id_code = id_code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Customer(String id, String name, String sex, Integer age, String phone, String address, String idtype_id,
			String id_code, String company, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.idtype_id = idtype_id;
		this.id_code = id_code;
		this.company = company;
		this.telephone = telephone;
	}
	
	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}
}
