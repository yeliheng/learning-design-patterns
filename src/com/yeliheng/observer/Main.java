package com.yeliheng.observer;

public class Main {
    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();
        MessageClient client = new MessageClient();
        publisher.add(client);
        publisher.notifyObserver("Hello，Publisher");
    }
}
