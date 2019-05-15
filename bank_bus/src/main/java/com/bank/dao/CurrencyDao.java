/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Currency;

/**
 * @author admin
 * 2019年4月26日
 */
public interface CurrencyDao {
	
	//查看列表
	List<Currency> getList(Currency pojo);

	//添加
	Boolean insertOne(Currency pojo);

	//更新
	Integer updateOne(Currency pojo);
	
	//删除
	Integer deleteOne(Currency pojo);
	
	//分页
	Pagehelper<Currency> getPagehelper(Currency pojo,Integer page,Integer size);
}
