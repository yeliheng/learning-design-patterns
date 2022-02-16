package com.yeliheng.adapter.objectadapter;

public class LoginObjectAdapter implements Target{

    private Adaptee adaptee;

    public LoginObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void login() {
        adaptee.qqLogin();
    }
}
