package com.yeliheng.strategy;

/**
 * 折扣策略
 */
public class BucklingDiscount implements Strategy{

    private final long discount = 8;

    //为了演示简单，直接省去小数，使用long类型。实际项目切忌这样使用。
    @Override
    public long discount(long price) {
        return (long) (price * discount * 0.1);
    }
}
