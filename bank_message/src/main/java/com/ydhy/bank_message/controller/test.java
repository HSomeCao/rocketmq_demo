package com.ydhy.bank_message.controller;

import com.bank.common.info.MQResult;
import com.bank.common.mqservice.ProducerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoliangwei on  2019/5/27 10:50
 */
@RestController
@RequestMapping("/message")
public class test {
    @Autowired(required = false)
    ProducerSer producerSer;

    @RequestMapping("/AsyncP")
    @ResponseBody
    MQResult testAsyncP(){
       return producerSer.AsyncProducer();
    }
}
