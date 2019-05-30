package com.ydhy.bank_message.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by caoliangwei on  2019/5/30 17:45
 */
@Data
@AllArgsConstructor
public class OrderPaidEvent implements Serializable {
        private String orderId;

        private BigDecimal paidMoney;
}
