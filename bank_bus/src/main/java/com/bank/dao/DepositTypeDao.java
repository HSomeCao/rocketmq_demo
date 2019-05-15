/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.DepositType;

/**
 * @author admin
 * 2019年4月26日
 */
public interface DepositTypeDao {
	
	//查看列表
	List<DepositType> getList(DepositType pojo);

	//添加
	Boolean insertOne(DepositType pojo);

	//更新
	Integer updateOne(DepositType pojo);
	
	//删除
	Integer deleteOne(DepositType pojo);
	
	//分页
	Pagehelper<DepositType> getPagehelper(DepositType pojo,Integer page,Integer size);
}
