package com.yeliheng.factory.abstractfactory;

/**
 * 具体产品类
 */
public class Log4jFileLogger implements FileLogger{
    @Override
    public void debug(String text) {

    }

    @Override
    public void info(String text) {
        System.out.println("--[INFO]-- Log4j输出的[文件]日志: " + text);
    }

    @Override
    public void warning(String text) {

    }

    @Override
    public void error(String text) {

    }
}
