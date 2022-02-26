package com.yeliheng.state;

public class PendingPaymentState extends State{
    @Override
    public void handle(Context context) {
        System.out.println("[订单待付款-买家中心] 您有一笔订单等待付款。");
        context.setState(new PendingDeliveryState());
    }
}
