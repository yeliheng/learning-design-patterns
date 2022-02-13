package com.yeliheng.factory.abstractfactory;

/**
 *
 * Log4j工厂
 */
public class Log4jFactory implements Factory{
    @Override
    public ConsoleLogger consoleLogger() {
        return new Log4jConsoleLogger();
    }

    @Override
    public FileLogger fileLogger() {
        return new Log4jFileLogger();
    }
}
