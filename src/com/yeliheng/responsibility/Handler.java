package com.yeliheng.responsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {

    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int days);
}
