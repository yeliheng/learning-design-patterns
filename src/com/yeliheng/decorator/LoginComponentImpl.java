package com.yeliheng.decorator;

/**
 * 具体组件
 */
public class LoginComponentImpl implements ILoginComponent{
    @Override
    public void login() {
        System.out.println("登录成功！");
    }
}
