package com.yeliheng.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("yeliheng");
        user.setPassword("123456");
        user.setNickname("测试用户");
        System.out.println(user.toString());
    }
}
