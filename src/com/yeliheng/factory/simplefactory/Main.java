package com.yeliheng.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Apple apple = (Apple) SimpleFactory.make(0);
        Banana banana = (Banana) SimpleFactory.make(1);
        apple.show();
        banana.show();
    }

    //水果产品
    public interface Fruit {
        void show();
    }

    //具体产品
    static class Apple implements Fruit {
        public void show() {
            System.out.println("苹果书上长苹果...");
        }
    }

    //具体产品
    static class Banana implements Fruit {
        public void show() {
            System.out.println("香蕉树上长香蕉...");
        }
    }

    //工厂生产
    static class SimpleFactory {
        public static Fruit make(int kind) {
            switch (kind) {
                case 0:
                    return new Apple();
                case 1:
                    return new Banana();
            }
            return null;
        }
    }
}
