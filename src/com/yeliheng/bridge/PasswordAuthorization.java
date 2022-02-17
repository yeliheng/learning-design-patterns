package com.yeliheng.bridge;

public class PasswordAuthorization implements IPaymentAuthorization{

    @Override
    public boolean authorization() {
        //TODO: 具体的密码验证逻辑...
        System.out.println("[系统] 支付密码验证通过!");
        return true;
    }
}
