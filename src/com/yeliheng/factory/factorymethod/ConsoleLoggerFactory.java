package com.yeliheng.factory.factorymethod;

/**
 * 具体工厂
 */
public class ConsoleLoggerFactory implements LoggerFactory{
    @Override
    public Logger getLogger() {
        return new ConsoleLogger();
    }
}
