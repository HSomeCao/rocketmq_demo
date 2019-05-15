/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Suspend;

/**
 * @author admin
 * 2019年4月26日
 */
public interface SuspendDao {
	
	//查看列表
	List<Suspend> getList(Suspend pojo);

	//添加
	Boolean insertOne(Suspend pojo);

	//更新
	Integer updateOne(Suspend pojo);
	
	//删除
	Integer deleteOne(Suspend pojo);
	
	//分页
	Pagehelper<Suspend> getPagehelper(Suspend pojo,Integer page,Integer size);
}
