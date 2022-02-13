package com.yeliheng.factory.factorymethod;

/**
 * 日志产品的抽象
 */
public interface Logger {
    //日志级别
    void debug();

    void info();

    void warning();

    void error();

}
