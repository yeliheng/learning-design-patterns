package com.yeliheng.factory.abstractfactory;

/**
 * 抽象产品类: 控制台日志
 */
public interface ConsoleLogger{

    //日志级别

    void debug(String text);

    void info(String text);

    void warning(String text);

    void error(String text);

}
