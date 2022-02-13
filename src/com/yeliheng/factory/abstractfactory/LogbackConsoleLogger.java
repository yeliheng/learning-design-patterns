package com.yeliheng.factory.abstractfactory;

public class LogbackConsoleLogger implements ConsoleLogger{
    @Override
    public void debug(String text) {

    }

    @Override
    public void info(String text) {
        System.out.println("**[INFO]** Logback输出的[控制台]日志: " + text);
    }

    @Override
    public void warning(String text) {

    }

    @Override
    public void error(String text) {

    }
}
