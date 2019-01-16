package com.example.msg.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author WJQ
 * @Title: HelloController
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/915:54
 */
@RestController
public class HelloController {

    @Autowired
    private AmqpTemplate amqpTemplate;


    @GetMapping("/say")
    public String  say(){
        System.out.println("jajaj");
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        System.out.println("发送---------------------------------------");
        for (int i = 0; i < 1000; i++) {
            amqpTemplate.convertAndSend("hello",context);
        }

        return "hello java" ;
    }
}
