package com.yeliheng.bridge;

public class Main {
    public static void main(String[] args) {
        //微信人脸支付
        System.out.println("用户选择使用微信人脸支付，开始模拟。");
        PayAbstraction wechatPay = new WechatPay(new FaceAuthorization());
        wechatPay.pay("Yeliheng","Gnehiley",100000L);

        //支付宝指纹支付
        System.out.println("\n用户选择使用支付宝指纹支付，开始模拟。");
        PayAbstraction alipay = new Alipay(new FingerprintAuthorization());
        alipay.pay("Yeliheng","Gnehiley",100000L);
    }
}
