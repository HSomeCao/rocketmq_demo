package com.bank.common.service;


import com.bank.common.info.Messages;
import com.bank.common.pojo.Customer;

public interface CustomerService {

	Messages openAccount(Customer customer);
	
	Messages get(Customer customer);
}
