package com.ydhy.bank_message.service.impl;

import com.bank.common.info.MQResult;
import com.bank.common.mqservice.ProducerSer;
import com.ydhy.bank_message.domain.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by caoliangwei on  2019/5/27 16:27
 */

public class ProducerSerImpl implements ProducerSer {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public MQResult AsyncProducer() {
        rocketMQTemplate.convertAndSend("test-topic-1", "Hello, World!");
        rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
        rocketMQTemplate.convertAndSend("test-topic-2", new OrderPaidEvent("T_001", new BigDecimal("88.00")));
        return null;
    }

    @Override
    public MQResult BroadcastProducer() {
        return null;
    }

    @Override
    public MQResult OnewayProducer() {
        return null;
    }

    @Override
    public MQResult OrderedProducer() {
        return null;
    }

    @Override
    public MQResult ScheduledMessageProducer() {
        return null;
    }

    @Override
    public MQResult SyncProducer() {
        return null;
    }

    @Override
    public MQResult TransactionProducer() {
        return null;
    }

}
