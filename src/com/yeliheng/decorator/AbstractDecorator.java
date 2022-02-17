package com.yeliheng.decorator;

/**
 * 抽象装饰
 */
public class AbstractDecorator implements ILoginComponent{
    protected ILoginComponent component;

    public AbstractDecorator(ILoginComponent component) {
        this.component = component;
    }

    @Override
    public void login() {
        component.login();
    }
}
