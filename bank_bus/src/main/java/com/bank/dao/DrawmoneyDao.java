/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Drawmoney;

/**
 * @author admin
 * 2019年4月26日
 */
public interface DrawmoneyDao {
	
	//查看列表
	List<Drawmoney> getList(Drawmoney pojo);

	//添加
	Boolean insertOne(Drawmoney pojo);

	//更新
	Integer updateOne(Drawmoney pojo);
	
	//删除
	Integer deleteOne(Drawmoney pojo);
	
	//分页
	Pagehelper<Drawmoney> getPagehelper(Drawmoney pojo,Integer page,Integer size);
}
