package com.ydhy.bank_message.controller;

import com.bank.common.info.MQResult;
import com.bank.common.mqservice.CustomerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoliangwei on  2019/5/30 10:13
 */
@RestController
@RequestMapping("/message/customer")
public class CustomerController {

    @Autowired(required = false)
    CustomerSer customerSer;

    @RequestMapping("/test")
    MQResult test(){
        customerSer.cus_consumer();
        return null;
    }
}
