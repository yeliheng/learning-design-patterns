package com.yeliheng.proxy;

/**
 * 代理类
 */
public class SmsProxy implements ISmsService{
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public void send(String message) {
        //在这里执行相关的预处理操作...
        //-------------

        //发送验证码
        smsService.send(message);

        //后处理操作...
        //--------------
    }
}
