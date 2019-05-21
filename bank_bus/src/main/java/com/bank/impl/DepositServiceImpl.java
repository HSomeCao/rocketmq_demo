package com.bank.impl;

import com.bank.common.pojo.Card;
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

	@Override
	public Card getObjectTest() {
		// TODO Auto-generated method stub

		Card a=new Card();

		//c 请求端实体类
//		public String id;	//银行卡id
//		public String card_number;	//卡
//		public String type_id;		//卡类型id
//		public String customer_id;	//客户id
//		public String creat_time;	//开卡时间
//		public Integer flag;		//通兑标志
//		public Integer grade;		//账户等级（一二三类账户）
//		public String password;		//卡密码
//		public Integer status;		//帐户状态
//		public String salt;			//盐
//		public String dealpwd;		//交易密码

		//b 服务端实体类
//		public String id;	//银行卡id
//		public String code;	//卡号
//		public Integer character;	//卡性质
//		public String type_id;		//卡类型id
//		public String customer_id;	//客户id
//		public String creat_time;	//开卡时间
//		public Integer flag;		//通兑标志
//		public Integer isagency;	//是否代理
//		public Integer grade;		//账户等级（一二三类账户）
//		public String password;		//卡密码
//		public Integer status;		//帐户状态
//		public String salt;			//盐
//		public String dealpwd;		//交易密码

		a.setId("0000000001");      //银行卡id
		a.setType_id("00000001");   //卡类型id
		a.setCustomer_id("0000001");//客户id
		a.setCreat_time("2019.01.01");//开卡时间
		a.setFlag(1);               //通兑标志
		a.setGrade(1);              //账户等级（一二三类账户）
		a.setPassword("123456");    //卡密码
		a.setStatus(1);             //帐户状态
		a.setSalt("0000001");       //盐
		a.setDealpwd("123456");     //交易密码
		a.setCid("100001");






		return a;
	}

}
