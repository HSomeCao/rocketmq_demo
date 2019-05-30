package com.ydhy.bank_message.controller;

import com.bank.common.info.MQResult;
import com.bank.common.mqservice.ProducerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caoliangwei on  2019/5/30 10:13
 */
@RestController
@RequestMapping("/message/producer")
public class ProducerController {

    @Autowired(required = false)
    ProducerSer producerSer;

    @RequestMapping("/test")
    @ResponseBody
    MQResult testAsyncP() {
        return producerSer.AsyncProducer();
    }
}
