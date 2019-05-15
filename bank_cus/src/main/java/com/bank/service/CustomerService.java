package com.bank.service;

import com.bank.common.Messages;
import com.bank.pojo.Customer;

public interface CustomerService {

	Messages openAccount(Customer customer);
	
	Messages get(Customer customer);
}
