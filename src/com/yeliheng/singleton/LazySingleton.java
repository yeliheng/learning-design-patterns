package com.yeliheng.singleton;

public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null; //创建一个空的懒汉式单例

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
