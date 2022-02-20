package com.yeliheng.flyweight;

public class Main {
    public static void main(String[] args) {

        UserFlyweightFactory.getUser(1L); //第一次调用

        UserFlyweightFactory.getUser(1L); //第二次调用
    }
}
