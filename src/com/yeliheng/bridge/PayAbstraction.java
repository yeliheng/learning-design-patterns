package com.yeliheng.bridge;

/**
 * 抽象化类
 */
public abstract class PayAbstraction {

    protected IPaymentAuthorization paymentAuth;

    public PayAbstraction(IPaymentAuthorization paymentAuth) {
        this.paymentAuth = paymentAuth;
    }

    /**
     * 支付
     * @param payer 转账者
     * @param payee 收款者
     */
    public abstract void pay(String payer,String payee,Long amount);

}
