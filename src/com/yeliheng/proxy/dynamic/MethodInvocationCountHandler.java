package com.yeliheng.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 统计调用方法的次数
 */
public class MethodInvocationCountHandler implements InvocationHandler {

    private int count = 0;

    private final Object implementation;

    public MethodInvocationCountHandler(final Object implementation) {
        this.implementation = implementation;
    }

    public int getCount( ) {
        return count;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        try {
            this.count++;
            System.out.println("测试方法被调用: " + this.count + "次");
            return method.invoke(implementation, args);
        } catch (final InvocationTargetException e) {
            throw e.getTargetException( );
        }
    }
}
