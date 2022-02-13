package com.yeliheng.singleton;

/**
 * 单例模式
 */
public class Main {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        if(obj1.equals(obj2)) {
            System.out.println("obj1和obj2是同一个实例，任务管理器只能创建一个！");
        }
    }
}
