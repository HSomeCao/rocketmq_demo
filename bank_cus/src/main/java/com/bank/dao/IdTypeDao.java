/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.IdType;

/**
 * @author admin
 * 2019年4月27日
 */
public interface IdTypeDao {
	//查看列表
		List<IdType> getList(IdType pojo);

		//添加
		Boolean insertOne(IdType pojo);

		//更新
		Integer updateOne(IdType pojo);
		
		//删除
		Integer deleteOne(IdType pojo);
		
		//分页
		Pagehelper<IdType> getPagehelper(IdType pojo,Integer page,Integer size);
}
