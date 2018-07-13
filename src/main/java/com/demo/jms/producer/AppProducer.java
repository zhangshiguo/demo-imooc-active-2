package com.demo.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建人是: zsg 创建时间: 2017/11/17 0017.
 */
public class AppProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 1; i < 100; i++) {
            service.sendMessage("text : " + i);
        }
        context.close();
    }
}
