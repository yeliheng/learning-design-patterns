package com.yeliheng.bridge;

public class FaceAuthorization implements IPaymentAuthorization{
    @Override
    public boolean authorization() {
        //TODO: 具体的人脸验证逻辑...
        System.out.println("[系统] 人脸验证通过!");
        return true;
    }
}
