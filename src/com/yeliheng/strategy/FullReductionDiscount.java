package com.yeliheng.strategy;

/**
 * 满减策略
 */
public class FullReductionDiscount implements Strategy{

    private final long count = 1000; //满1000

    private final long amount = 100; //满减金额

    @Override
    public long discount(long price) {

        if(price > count) {
            return price - amount;
        } else {
           return price;
        }
    }
}
