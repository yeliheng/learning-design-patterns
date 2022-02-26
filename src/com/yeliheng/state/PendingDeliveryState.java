package com.yeliheng.state;

public class PendingDeliveryState extends State{
    @Override
    public void handle(Context context) {
        System.out.println("[订单待发货-卖家中心] 买家已付款，请尽快发货。");
        context.setState(new PendingReceiptState());
    }
}
