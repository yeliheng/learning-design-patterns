package com.yeliheng.strategy;

public class Main {

    private static final long price = 2000; // 商品价格

    public static void main(String[] args) {

        Context context = new Context();

        System.out.println("[直减策略] 商品原价：" + price);
        Strategy strategy = new MinusDiscount();
        context.setStrategy(strategy);
        context.discount(price);

        System.out.println("-----------------");

        System.out.println("[满减策略] 商品原价：" + price);
        strategy = new FullReductionDiscount();
        context.setStrategy(strategy);
        context.discount(price);

        System.out.println("-----------------");

        System.out.println("[折扣策略] 商品原价：" + price);
        strategy = new BucklingDiscount();
        context.setStrategy(strategy);
        context.discount(price);
    }
}
