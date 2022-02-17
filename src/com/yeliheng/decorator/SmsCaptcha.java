package com.yeliheng.decorator;

/**
 * 具体装饰-短信验证码
 */
public class SmsCaptcha extends AbstractDecorator{
    public SmsCaptcha(ILoginComponent component) {
        super(component);
    }

    @Override
    public void login() {
        System.out.println("短信验证码验证通过!");
        super.login();
    }
}
