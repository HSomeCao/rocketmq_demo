package com.bank.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.common.Messages;
import com.bank.pojo.Customer;
import com.bank.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/add")
	@ResponseBody
	public Messages open(@RequestBody Customer customer) {
		if (StringUtils.isBlank(customer.id_code) || StringUtils.isBlank(customer.idtype_id)
				|| StringUtils.isBlank(customer.name) || StringUtils.isBlank(customer.phone)) {
			return new Messages(false, "缺少参数");
		}
		return customerService.openAccount(customer);
	}

	@RequestMapping("/get")
	@ResponseBody
	public Messages get(@RequestBody Customer customer) {
		if ((StringUtils.isBlank(customer.id_code) || StringUtils.isBlank(customer.idtype_id))
				&& StringUtils.isBlank(customer.phone)&& StringUtils.isBlank(customer.id)) {
			return new Messages(false, "缺少参数");
		}
		return customerService.get(customer);
	}
}
