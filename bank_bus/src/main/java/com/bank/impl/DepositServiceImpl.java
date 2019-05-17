package com.bank.impl;

import org.apache.dubbo.config.annotation.Service;

import com.bank.common.service.DepositService;


@Service
public class DepositServiceImpl implements DepositService {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		System.out.println("bus_test()_被触发");
		return "test";
	}

	@Override
	public String test2(String string) {
		// TODO Auto-generated method stub
		System.out.println("bus_test2(String string)_被触发");
		return "test2:" + string;
	}

	@Override
	public String test3(Integer i) {
		// TODO Auto-generated method stub
		System.out.println("bus_test3(Integer i)_被触发");
		return "test3:" + i;
	}

}
