package com.yeliheng.bridge;

/**
 * 扩展抽象化
 */
public class Alipay extends PayAbstraction{

    public Alipay(IPaymentAuthorization paymentAuth) {
        super(paymentAuth);
    }

    /**
     * 支付
     *
     * @param payer 转账者
     * @param payee 收款者
     */
    @Override
    public void pay(String payer, String payee, Long amount) {
        System.out.println("[订单创建] 转账人: " + payer + " 收款者: " + payee + " 转账金额: " + amount);
        System.out.println("[系统] 开始校验身份...");
        boolean auth = paymentAuth.authorization();
        if(auth) {
            System.out.println("[信息] 支付宝支付成功！转账人: " + payer + " 收款者: " + payee + " 转账金额: " + amount);
        }
    }
}
