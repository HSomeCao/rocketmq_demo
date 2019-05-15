/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.InterBank;

/**
 * @author admin
 * 2019年4月26日
 */
public interface InterBankDao {
	
	//查看列表
	List<InterBank> getList(InterBank pojo);

	//添加
	Boolean insertOne(InterBank pojo);

	//更新
	Integer updateOne(InterBank pojo);
	
	//删除
	Integer deleteOne(InterBank pojo);
	
	//分页
	Pagehelper<InterBank> getPagehelper(InterBank pojo,Integer page,Integer size);
}
