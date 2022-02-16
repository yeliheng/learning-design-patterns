package com.yeliheng.adapter.classadapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("适配器测试：尝试微信登录...");

        Target target = new LoginAdapter();
        target.login();
    }
}
