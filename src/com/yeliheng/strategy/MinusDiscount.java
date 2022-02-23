package com.yeliheng.strategy;

/**
 * 直减策略
 */
public class MinusDiscount implements Strategy{

    private final long amount = 100; // 直减100元

    @Override
    public long discount(long price) {
        return price - amount;
    }
}
