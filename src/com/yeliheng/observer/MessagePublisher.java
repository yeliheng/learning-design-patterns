package com.yeliheng.observer;

public class MessagePublisher extends IPublisher{

    @Override
    public void notifyObserver(String message) {
        System.out.println("[服务器] 已发送消息！");
        for(Observer obj : subscriberList) {
            obj.receive(message);
        }
    }
}
