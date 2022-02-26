package com.yeliheng.state;

public class PendingReceiptState extends State{
    @Override
    public void handle(Context context) {
        System.out.println("[订单待收货-买家中心] 卖家已发货，当前物流在：XXX省XXX市");
    }
}
