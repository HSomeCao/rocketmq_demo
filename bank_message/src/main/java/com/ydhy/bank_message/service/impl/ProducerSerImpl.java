package com.ydhy.bank_message.service.impl;

import com.bank.common.info.MQResult;
import com.bank.common.mqservice.ProducerSer;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

import javax.annotation.Resource;

/**
 * Created by caoliangwei on  2019/5/27 16:27
 */
public class ProducerSerImpl implements ProducerSer {

    @Resource
    private RocketMQTemplate rocketMQTemplate;
    @Override
    public MQResult AsyncProducer() {
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
