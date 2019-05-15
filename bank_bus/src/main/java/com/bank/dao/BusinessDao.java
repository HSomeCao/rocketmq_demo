/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Business;

/**
 * @author admin
 * 2019年4月27日
 */
public interface BusinessDao {
	//查看列表
		List<Business> getList(Business pojo);

		//添加
		Boolean insertOne(Business pojo);

		//更新
		Integer updateOne(Business pojo);
		
		//删除
		Integer deleteOne(Business pojo);
		
		//分页
		Pagehelper<Business> getPagehelper(Business pojo,Integer page,Integer size);
}
