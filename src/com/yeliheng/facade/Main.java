package com.yeliheng.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("开始进行图像压缩");
        CompressFacade compressFacade = new CompressFacade();
        compressFacade.compress();
    }
}
