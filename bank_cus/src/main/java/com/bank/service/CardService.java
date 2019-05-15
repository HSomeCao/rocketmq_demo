package com.bank.service;

import com.bank.common.Messages;
import com.bank.pojo.Card;

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
