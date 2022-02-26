package com.yeliheng.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(); //注册上下文
        //买家付款
        context.handle();
        //卖家发货
        context.handle();
        //买家收货
        context.handle();

    }
}
