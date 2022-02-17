package com.yeliheng.bridge;

public class FingerprintAuthorization implements IPaymentAuthorization{
    @Override
    public boolean authorization() {
        //TODO: 具体的指纹验证逻辑...
        System.out.println("[系统] 指纹验证通过!");
        return true;
    }
}
