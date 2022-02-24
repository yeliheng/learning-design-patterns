package com.yeliheng.command;

/**
 * 具体命令
 */
public class BuyCommand implements Order{

    private StockCommandReceiver receiver;

    public BuyCommand(StockCommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.buy();
    }
}
