/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Appointment;

/**
 * @author admin
 * 2019年4月26日
 */
public interface AppointmentDao {
	
	//查看列表
	List<Appointment> getList(Appointment pojo);

	//添加
	Boolean insertOne(Appointment pojo);

	//更新
	Integer updateOne(Appointment pojo);
	
	//删除
	Integer deleteOne(Appointment pojo);
	
	//分页
	Pagehelper<Appointment> getPagehelper(Appointment pojo,Integer page,Integer size);
}
