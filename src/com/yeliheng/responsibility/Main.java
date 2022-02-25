package com.yeliheng.responsibility;

public class Main {
    public static void main(String[] args) {
        //注册处理者
        Handler counselor = new Counselor();
        Handler departmentHead = new DepartmentHead();
        Handler studentWorkOffice = new StudentWorkOffice();

        //设置责任链
        counselor.setNextHandler(departmentHead);
        counselor.setNextHandler(studentWorkOffice);

        counselor.handleRequest(5);
    }
}
