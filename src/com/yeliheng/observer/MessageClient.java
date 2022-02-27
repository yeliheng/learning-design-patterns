package com.yeliheng.observer;

/**
 * 具体观察者，即接收消息的客户端
 */
public class MessageClient implements Observer {
    @Override
    public void receive(String message) {
        System.out.println("[客户端] 收到消息：" + message);
    }
}
