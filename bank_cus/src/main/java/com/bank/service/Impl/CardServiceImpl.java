package com.bank.service.Impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;

import com.bank.common.Encrypt;
import com.bank.common.Messages;
import com.bank.config.AppConfig;
import com.bank.dao.Impl.CardDaoImpl;
import com.bank.dao.Impl.CustomerDaoImpl;
import com.bank.dao.Impl.MoneyDaoImpl;
import com.bank.pojo.Card;
import com.bank.pojo.Customer;
import com.bank.pojo.Money;
import com.bank.service.CardService;

import vig.core.util.TimeCycle;

@Service
public class CardServiceImpl implements CardService {

	private CardDaoImpl CardDao = new CardDaoImpl(AppConfig.getCID());

	private MoneyDaoImpl MoneyDao = new MoneyDaoImpl(AppConfig.getCID());

	private CustomerDaoImpl customerDao = new CustomerDaoImpl(AppConfig.getCID());

	/*
	 * 卡数量超出限制判断
	 */
	private Boolean ifExcess(Card card) {
		return false;
	}

	/*
	 * 开卡
	 */
	@Override
	public Messages add(Card card) {

		// 查询客户
		Customer cus = new Customer();
		cus.setId(card.customer_id);
		List<Customer> cuslist = customerDao.getList(cus);
		if (cuslist == null || cuslist.isEmpty()) {
			return new Messages(false, "查无此用户");
		}
		// 查询数量限制
		if (ifExcess(card)) {
			return new Messages(false, "卡数量超出限制");
		}
		// 查询卡号
		Card cardnum = new Card();
		cardnum.setCard_number(card.card_number);
		List<Card> cardlist = CardDao.getList(cardnum);
		if (cardlist != null && !cardlist.isEmpty()) {
			return new Messages(false, "卡号已存在");
		}
		// 添加卡
		card.setId(TimeCycle.getMicrosecond());
		card.setCreat_time(System.currentTimeMillis() / 1000 + "");
		card.setSalt(Encrypt.sha3256(card.creat_time.getBytes()));
		card.setPassword(Encrypt.sha3256((card.password + card.salt).getBytes()));
		card.setDealpwd(Encrypt.sha3256((card.dealpwd + card.salt).getBytes()));
		if (CardDao.insertOne(card)) {
			return new Messages(true, "操作成功");
		} else {
			return new Messages(false, "操作失败");
		}
	}

	/*
	 * 查询卡
	 */
	@Override
	public Messages get(String num) {
		Card cardnum = new Card();
		cardnum.setCard_number(num);
		List<Card> cardlist = CardDao.getList(cardnum);
		if (cardlist == null || cardlist.isEmpty()) {
			return new Messages(false, "卡号不存在");
		} else {
			return new Messages(true, "操作成功", cardlist.get(0));
		}
	}

	/*
	 * 销卡
	 */
	@Override
	public Messages delete(String num) {
		// 查询卡
		Card cardnum = new Card();
		cardnum.setCard_number(num);
		List<Card> cardlist = CardDao.getList(cardnum);
		if (cardlist == null || cardlist.isEmpty()) {
			return new Messages(false, "卡号不存在");
		}
		cardnum = cardlist.get(0);

		// 查询余额
		Money money = new Money();
		money.setCard_id(cardnum.card_number);
		List<Money> mlist = MoneyDao.getList(money);
		if (mlist != null && !mlist.isEmpty()) {
			return new Messages(false, "余额未清空");
		}

		// 销卡
		cardnum.setStatus(1);
		if (CardDao.updateOne(cardnum) > 0) {
			return new Messages(true, "操作成功");
		} else {
			return new Messages(false, "操作失败");
		}
	}

	/*
	 * 修改密码
	 */
	@Override
	public Messages changePassword(String newpsd, String num) {
		// 查询卡
		Card cardnum = new Card();
		cardnum.setCard_number(num);
		List<Card> cardlist = CardDao.getList(cardnum);
		if (cardlist == null || cardlist.isEmpty()) {
			return new Messages(false, "卡号不存在");
		}
		cardnum = cardlist.get(0);
		
		cardnum.setPassword(Encrypt.sha3256((newpsd + cardnum.salt).getBytes()));		
		if(CardDao.updateOne(cardnum)>0) {
			return new Messages(true, "操作成功");
		}else {
			return new Messages(false, "操作失败");
		}
	}

	/*
	 * 修改交易密码
	 */
	@Override
	public Messages changeDealPassword(String newpsd, String num) {
		// 查询卡
		Card cardnum = new Card();
		cardnum.setCard_number(num);
		List<Card> cardlist = CardDao.getList(cardnum);
		if (cardlist == null || cardlist.isEmpty()) {
			return new Messages(false, "卡号不存在");
		}
		cardnum = cardlist.get(0);
		
		cardnum.setDealpwd(Encrypt.sha3256((newpsd + cardnum.salt).getBytes()));	
		if(CardDao.updateOne(cardnum)>0) {
			return new Messages(true, "操作成功");
		}else {
			return new Messages(false, "操作失败");
		}
	}

}
