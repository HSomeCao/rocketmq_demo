/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Type;

/**
 * @author admin
 * 2019年4月27日
 */
public interface TypeDao {
	//查看列表
		List<Type> getList(Type pojo);

		//添加
		Boolean insertOne(Type pojo);

		//更新
		Integer updateOne(Type pojo);
		
		//删除
		Integer deleteOne(Type pojo);
		
		//分页
		Pagehelper<Type> getPagehelper(Type pojo,Integer page,Integer size);
}
