package com.ydhy.bank_message.service.impl;

import com.bank.common.info.MQResult;
import com.bank.common.mqservice.CustomerSer;
import org.apache.dubbo.config.annotation.Service;


/**
 * Created by caoliangwei on  2019/5/27 16:27
 */

public class CustomerSerImpl implements CustomerSer {
    @Override
    public MQResult BroadcastConsumer() {
        return null;
    }

    @Override
    public MQResult cus_consumer() {
        return null;
    }

    @Override
    public MQResult OrderedConsumer() {
        return null;
    }

    @Override
    public MQResult ScheduledMessageConsumer() {
        return null;
    }
}
