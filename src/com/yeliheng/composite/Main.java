package com.yeliheng.composite;

public class Main {

    public static void main(String[] args) {
        TreeComponent rootElement = new Directory("文件夹1");

        rootElement.add(new Directory("子文件夹1")
                .add(new File("文件1"))
                .add(new File("文件2"))
        );

        rootElement.add(new Directory("子文件夹2"));

        System.out.println(rootElement);
    }
}
