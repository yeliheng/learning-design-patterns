package com.yeliheng.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ITest test = new Test();
        MethodInvocationCountHandler handler = new MethodInvocationCountHandler(test);
        ITest proxy = (ITest) Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(),handler);
        proxy.test();
        proxy.test();
    }
}
