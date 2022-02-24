package com.yeliheng.command;

public class Main {
    public static void main(String[] args) {

        //注册接收者
        StockCommandReceiver receiver = new StockCommandReceiver();
        //注册命令
        BuyCommand buyCommand = new BuyCommand(receiver);
        SellCommand sellCommand = new SellCommand(receiver);

        //下单
        Invoker invoker = new Invoker();
        invoker.takeOrder(buyCommand);
        invoker.takeOrder(sellCommand);

        //处理订单
        invoker.handleOrders();
    }
}
