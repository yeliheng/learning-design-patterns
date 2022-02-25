package com.yeliheng.responsibility;

public class StudentWorkOffice extends Handler{
    @Override
    public void handleRequest(int days) {
       System.out.println("[学工处] 请假时间: " + days + "天 状态：批准");
    }
}
