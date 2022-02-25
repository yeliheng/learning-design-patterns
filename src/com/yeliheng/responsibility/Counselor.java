package com.yeliheng.responsibility;

public class Counselor extends Handler{
    @Override
    public void handleRequest(int days) {
        if(days <= 2) {
            System.out.println("[辅导员] 请假时间: " + days + "天 状态：批准");
        } else {
            if(getNextHandler() != null)
                getNextHandler().handleRequest(days);
            else System.out.println("无法处理此请求，原因：没有合适的处理器");
        }
    }
}
