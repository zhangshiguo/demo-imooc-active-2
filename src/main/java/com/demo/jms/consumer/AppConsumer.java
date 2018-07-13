package com.demo.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建人是: zsg 创建时间: 2017/11/17 0017.
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
