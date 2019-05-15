/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Sequence;

/**
 * @author admin
 * 2019年4月26日
 */
public interface SequenceDao {
	
	//查看列表
	List<Sequence> getList(Sequence pojo);

	//添加
	Boolean insertOne(Sequence pojo);

	//更新
	Integer updateOne(Sequence pojo);
	
	//删除
	Integer deleteOne(Sequence pojo);
	
	//分页
	Pagehelper<Sequence> getPagehelper(Sequence pojo,Integer page,Integer size);
}
