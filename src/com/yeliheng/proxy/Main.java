package com.yeliheng.proxy;

public class Main {
    public static void main(String[] args) {

        //生成验证码
        int code = 123456;
        //使用代理发送短信验证码
        SmsService smsService = new SmsService();
        SmsProxy proxy = new SmsProxy(smsService);
        proxy.send("您的短信验证码是" + code);
    }
}
