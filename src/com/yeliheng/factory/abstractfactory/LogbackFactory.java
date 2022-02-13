package com.yeliheng.factory.abstractfactory;

/**
 * Logback工厂
 */
public class LogbackFactory implements Factory{

    @Override
    public ConsoleLogger consoleLogger() {
        return new LogbackConsoleLogger();
    }

    @Override
    public FileLogger fileLogger() {
        return new LogbackFileLogger();
    }
}
