package com.yeliheng.adapter.objectadapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("适配器测试：尝试登录...");

        Adaptee adaptee = new Adaptee();
        Target target = new LoginObjectAdapter(adaptee);
        target.login();
    }
}
