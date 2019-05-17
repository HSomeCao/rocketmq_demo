package com.bank.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.common.info.Messages;
import com.bank.common.pojo.Card;
import com.bank.common.service.CardService;
import com.bank.common.service.DepositService;


@Controller
@RequestMapping("/card")
public class CardController {

	@Autowired
	private CardService cardService;

	
	@Reference 
	private DepositService depositService;
	 
	 
	@RequestMapping("/add")
	@ResponseBody
	public Messages add(@RequestBody Card card) {
		if (StringUtils.isBlank(card.card_number) || StringUtils.isBlank(card.customer_id)
				|| StringUtils.isBlank(card.password) || StringUtils.isBlank(card.dealpwd)) {
			return new Messages(false, "缺少参数");
		}
		return cardService.add(card);
	}

	@RequestMapping("/get")
	@ResponseBody
	public Messages get(String num) {
		if (StringUtils.isBlank(num)) {
			return new Messages(false, "缺少参数");
		}
		return cardService.get(num);
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Messages delete(String num) {
		if (StringUtils.isBlank(num)) {
			return new Messages(false, "缺少参数");
		}
		return cardService.delete(num);
	}

	@RequestMapping("/testcus")
	@ResponseBody
	public String ddd() {
		//cardService.add(null);
		//return "sdaf";
		
		  String test = depositService.test();
		  System.out.println("cus_testcus_调用bus的test_返回值："+test); return test;
		 
	}

}
