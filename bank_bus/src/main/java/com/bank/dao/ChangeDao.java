/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Change;

/**
 * @author admin
 * 2019年4月26日
 */
public interface ChangeDao {
	
	//查看列表
	List<Change> getList(Change pojo);

	//添加
	Boolean insertOne(Change pojo);

	//更新
	Integer updateOne(Change pojo);
	
	//删除
	Integer deleteOne(Change pojo);
	
	//分页
	Pagehelper<Change> getPagehelper(Change pojo,Integer page,Integer size);
}
