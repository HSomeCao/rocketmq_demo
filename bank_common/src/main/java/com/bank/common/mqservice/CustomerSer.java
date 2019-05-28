package com.bank.common.mqservice;

import com.bank.common.info.MQResult;

/**
 * Created by caoliangwei on  2019/5/27 16:04
 */
public interface CustomerSer {

    MQResult BroadcastConsumer();

    MQResult cus_consumer();

    MQResult OrderedConsumer();

    MQResult ScheduledMessageConsumer();
}
