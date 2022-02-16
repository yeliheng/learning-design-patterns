package com.yeliheng.adapter.classadapter;

/**
 * 适配器
 */
public class LoginAdapter extends Adaptee implements Target{
    @Override
    public void login() {
        wechatLogin(); // 微信登录
    }
}
