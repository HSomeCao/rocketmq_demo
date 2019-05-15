/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Transfer;

/**
 * @author admin
 * 2019年4月26日
 */
public interface TransferDao {
	
	//查看列表
	List<Transfer> getList(Transfer pojo);

	//添加
	Boolean insertOne(Transfer pojo);

	//更新
	Integer updateOne(Transfer pojo);
	
	//删除
	Integer deleteOne(Transfer pojo);
	
	//分页
	Pagehelper<Transfer> getPagehelper(Transfer pojo,Integer page,Integer size);
}
