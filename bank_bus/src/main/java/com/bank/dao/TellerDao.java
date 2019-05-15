/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Teller;

/**
 * @author admin
 * 2019年4月26日
 */
public interface TellerDao {
	
	//查看列表
	List<Teller> getList(Teller pojo);

	//添加
	Boolean insertOne(Teller pojo);

	//更新
	Integer updateOne(Teller pojo);
	
	//删除
	Integer deleteOne(Teller pojo);
	
	//分页
	Pagehelper<Teller> getPagehelper(Teller pojo,Integer page,Integer size);
}
