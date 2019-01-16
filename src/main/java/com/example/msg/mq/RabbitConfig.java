package com.example.msg.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WJQ
 * @Title: RabbitConfig
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/916:08
 */

@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        System.out.println("Queue");
        return new Queue("hello");
    }

    @Bean
    public Queue ldh() {
        System.out.println("Queue1");
        return new Queue("ldh");
    }
}
