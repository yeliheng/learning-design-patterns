package com.yeliheng.factory.abstractfactory;

/**
 * 超级工厂
 */
public interface Factory {

    public ConsoleLogger consoleLogger();

    public FileLogger fileLogger();

}
