package com.yeliheng.proxy;

/**
 * 抽象主题
 */
public interface ISmsService {

    void send(String message); // 发送短信验证码

}
