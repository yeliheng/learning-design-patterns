package com.yeliheng.factory.factorymethod;

public class FileLogger implements Logger{
    @Override
    public void debug() {

    }

    @Override
    public void info() {
        System.out.println("[INFO] 这条日志被输出到[文件]");
    }

    @Override
    public void warning() {

    }

    @Override
    public void error() {

    }
}
