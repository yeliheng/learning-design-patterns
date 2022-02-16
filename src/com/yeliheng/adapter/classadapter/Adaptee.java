package com.yeliheng.adapter.classadapter;

/**
 * 被适配者
 */
public class Adaptee {
    public void wechatLogin() {
        System.out.println("微信登录成功，Token为xxx");
    }

    public void qqLogin() {
        System.out.println("qq登录成功，Token为xxx");
    }
}
