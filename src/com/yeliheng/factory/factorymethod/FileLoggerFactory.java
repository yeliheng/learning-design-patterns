package com.yeliheng.factory.factorymethod;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger getLogger() {
        return new FileLogger();
    }
}
