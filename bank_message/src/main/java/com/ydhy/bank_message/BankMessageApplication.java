package com.ydhy.bank_message;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigDecimal;

@SpringBootApplication
public class BankMessageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BankMessageApplication.class, args);
	}
		@Resource
		private RocketMQTemplate rocketMQTemplate;

		public void run(String... args) throws Exception {
			rocketMQTemplate.convertAndSend("test-topic-1", "Hello, World!");
			rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
			rocketMQTemplate.convertAndSend("test-topic-2", new OrderPaidEvent("T_001", new BigDecimal("88.00")));

//        rocketMQTemplate.destroy(); // notes:  once rocketMQTemplate be destroyed, you can not send any message again with this rocketMQTemplate
		}

		@Data
		@AllArgsConstructor
		public class OrderPaidEvent implements Serializable {
			private String orderId;

			private BigDecimal paidMoney;
		}
}
