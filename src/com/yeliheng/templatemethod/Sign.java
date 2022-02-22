package com.yeliheng.templatemethod;

/**
 * 签署协议
 */
public class Sign extends Policy{
    @Override
    public boolean agreeResult() {
        //同意所有协议
        return true;
    }
}
