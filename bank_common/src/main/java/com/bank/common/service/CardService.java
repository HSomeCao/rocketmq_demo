package com.bank.common.service;


import com.bank.common.info.Messages;
import com.bank.common.pojo.Card;

public interface CardService {

	Messages add(Card card);

	Messages get(String num);

	Messages delete(String num);

	Messages changePassword(String newpsd, String num);

	Messages changeDealPassword(String newpsd, String num);
	
//	Messages get(String num);
//	
//	Messages get(String num);
}
