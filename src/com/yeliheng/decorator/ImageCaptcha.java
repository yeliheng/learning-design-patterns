package com.yeliheng.decorator;

/**
 * 图形验证码-具体装饰
 */
public class ImageCaptcha extends AbstractDecorator{
    public ImageCaptcha(ILoginComponent component) {
        super(component);
    }

    @Override
    public void login() {
        System.out.println("图形验证已通过！");
        super.login();
    }
}
