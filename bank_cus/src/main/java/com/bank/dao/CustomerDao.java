/**
 * 
 */
package com.bank.dao;

import java.util.List;

import com.bank.common.Pagehelper;
import com.bank.pojo.Customer;

/**
 * @author admin 2019年4月27日
 */
public interface CustomerDao {
	// 查看列表
	List<Customer> getList(Customer pojo);

	// 添加
	Boolean insertOne(Customer pojo);

	// 更新
	Integer updateOne(Customer pojo);

	// 删除
	Integer deleteOne(Customer pojo);

	// 分页
	Pagehelper<Customer> getPagehelper(Customer pojo, Integer page, Integer size);
}
