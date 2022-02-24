package com.yeliheng.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者
 */
public class Invoker {

    private List<Order> orderList = new ArrayList<>();

    //下单
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    //处理订单
    public void handleOrders() {
        for(Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
