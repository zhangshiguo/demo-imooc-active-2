package com.demo.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 创建人是: zsg 创建时间: 2017/11/17 0017.
 */
public class ConsumerMessageListener implements MessageListener {

    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("--- 接收到的消息： ---" +textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
