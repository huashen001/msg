package com.example.msg.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author WJQ
 * @Title: HelloSender
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/916:16
 */

public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

      public  void send(){
          String context = "hello " + new Date();
          System.out.println("Sender : " + context);
          System.out.println("发送---------------------------------------");
          amqpTemplate.convertAndSend("hello",context);
      }
}
