package com.yeliheng.proxy;

/**
 * 真实主题
 */
public class SmsService implements ISmsService{

    @Override
    public void send(String message) {
        System.out.println("发送短信成功，内容为：" + message);
    }
}
