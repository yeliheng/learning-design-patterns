package com.yeliheng.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 消息发布者
 */
public abstract class IPublisher {

    protected List<Observer> subscriberList = new ArrayList<>();

    public void add(Observer subscriber) {
        subscriberList.add(subscriber);
    }

    public void remove(Observer subscriber) {
        subscriberList.remove(subscriber);
    }

    public abstract void notifyObserver(String message);
}
