/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Deposit;

/**
 * @author admin
 * 2019年4月26日
 */
public interface DepositDao {
	
	//查看列表
	List<Deposit> getList(Deposit pojo);

	//添加
	Boolean insertOne(Deposit pojo);

	//更新
	Integer updateOne(Deposit pojo);
	
	//删除
	Integer deleteOne(Deposit pojo);
	
	//分页
	Pagehelper<Deposit> getPagehelper(Deposit pojo,Integer page,Integer size);
}
