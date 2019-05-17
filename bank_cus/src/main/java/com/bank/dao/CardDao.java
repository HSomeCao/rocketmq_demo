/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.common.pojo.Card;

/**
 * @author admin
 * 2019年4月27日
 */
public interface CardDao {
	//查看列表
		List<Card> getList(Card pojo);

		//添加
		Boolean insertOne(Card pojo);

		//更新
		Integer updateOne(Card pojo);
		
		//删除
		Integer deleteOne(Card pojo);
		
		//分页
		Pagehelper<Card> getPagehelper(Card pojo,Integer page,Integer size);
}
