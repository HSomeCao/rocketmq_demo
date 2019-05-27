package com.bank.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;

import com.bank.common.info.Messages;
import com.bank.common.pojo.Customer;
import com.bank.common.service.CustomerService;
import com.bank.config.AppConfig;
import com.bank.dao.CustomerDao;
import com.bank.dao.Impl.CustomerDaoImpl;


import vig.core.util.TimeCycle;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao = new CustomerDaoImpl(AppConfig.getCID());

	/*
	 * 开户
	 */
	@Override  
	public Messages openAccount(Customer customer) {
		List<Customer> list = customerDao.getList(customer);
		if (list != null && !list.isEmpty()) {
			return new Messages(false, "已存在此用户");
		}
		customer.setId(TimeCycle.getMicrosecond());
		customer.setTime(System.currentTimeMillis() / 1000 + "");
		if (customerDao.insertOne(customer)) {
			return new Messages(true, "操作成功");
		} else {
			return new Messages(false, "操作失败");
		}
	}

	/*
	 * 查询客户
	 */
	@Override
	public Messages get(Customer customer) {
		List<Customer> list = customerDao.getList(customer);
		if (list == null || list.isEmpty()) {
			return new Messages(false, "不存在此用户");
		}else {
			return new Messages(true, "操作成功",list.get(0));
		}
	}

}
