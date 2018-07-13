package com.demo.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;


/**
 * 创建人是: zsg 创建时间: 2017/11/16 0016.
 */
public class ProducerServiceImpl implements ProducerService {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Resource(name = "topicDestination")
    private Destination destination;

    public void sendMessage(final String message) {
        //使用JmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                //发送一条消息
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("----- 发送的消息是: ----- " + message);
    }
}
