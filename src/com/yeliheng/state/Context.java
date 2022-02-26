package com.yeliheng.state;

public class Context {

    private State state;

    public Context() {
        this.state = new PendingPaymentState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }
}
