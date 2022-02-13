package com.yeliheng.factory.factorymethod;

public class ConsoleLogger implements Logger{
    @Override
    public void debug() {

    }

    @Override
    public void info() {
        System.out.println("[INFO] 这条日志被输出到[控制台]");
    }

    @Override
    public void warning() {

    }

    @Override
    public void error() {

    }
}
