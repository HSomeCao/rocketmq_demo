/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Money;

/**
 * @author admin
 * 2019年4月27日
 */
public interface MoneyDao {
	//查看列表
		List<Money> getList(Money pojo);

		//添加
		Boolean insertOne(Money pojo);

		//更新
		Integer updateOne(Money pojo);
		
		//删除
		Integer deleteOne(Money pojo);
		
		//分页
		Pagehelper<Money> getPagehelper(Money pojo,Integer page,Integer size);
}
