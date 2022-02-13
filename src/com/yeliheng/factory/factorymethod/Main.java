package com.yeliheng.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        //输出到控制台
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger logger1 = consoleLoggerFactory.getLogger();
        logger1.info();
        //输出到文件
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger logger2 = fileLoggerFactory.getLogger();
        logger2.info();

    }
}
