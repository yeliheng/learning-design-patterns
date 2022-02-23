package com.yeliheng.strategy;

public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void discount(long price) {
        System.out.println("折后价格：" + strategy.discount(price));
    }
}
