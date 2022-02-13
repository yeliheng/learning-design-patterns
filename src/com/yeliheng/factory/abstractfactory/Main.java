package com.yeliheng.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Factory log4jFactory = new Log4jFactory();
        ConsoleLogger consoleLogger = log4jFactory.consoleLogger();
        consoleLogger.info("测试日志");

        FileLogger fileLogger = log4jFactory.fileLogger();
        fileLogger.info("文件测试");

        Factory logbackFactory = new LogbackFactory();
        ConsoleLogger consoleLogger1 = logbackFactory.consoleLogger();
        consoleLogger1.info("测试日志");

        FileLogger fileLogger1 = logbackFactory.fileLogger();
        fileLogger1.info("文件测试");


    }
}
