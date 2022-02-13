package com.yeliheng.factory.abstractfactory;

/**
 * 抽象产品类: 文件日志
 */
public interface FileLogger{

    //日志级别
    void debug(String text);

    void info(String text);

    void warning(String text);

    void error(String text);
}
