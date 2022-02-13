package com.yeliheng.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("任务管理器已打开！");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
