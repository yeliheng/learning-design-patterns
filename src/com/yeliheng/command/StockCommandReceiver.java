package com.yeliheng.command;

/**
 * 命令接收者，处理具体的买卖逻辑
 */
public class StockCommandReceiver {

    private final String stockCode = "123456"; //股票代码

    private final int quantity = 100; //买入数量

    public void buy() {
        System.out.println("[买入] 股票代码: " + stockCode + " 数量(股): " + quantity);
    }

    public void sell() {
        System.out.println("[卖出] 股票代码: " + stockCode + " 数量(股): " + quantity);
    }
}
