package com.bank.common.mqservice;

import com.bank.common.info.MQResult;

/**
 * Created by caoliangwei on  2019/5/27 15:20
 */
public interface ProducerSer {

    MQResult AsyncProducer();

    MQResult BroadcastProducer();

    MQResult OnewayProducer();

    MQResult OrderedProducer();

    MQResult ScheduledMessageProducer();

    MQResult SyncProducer();

    MQResult TransactionProducer();
}
