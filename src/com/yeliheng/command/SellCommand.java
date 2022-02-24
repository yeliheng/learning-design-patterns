package com.yeliheng.command;

/**
 * 具体命令
 */
public class SellCommand implements Order{

    private StockCommandReceiver receiver;

    public SellCommand(StockCommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sell();
    }
}
