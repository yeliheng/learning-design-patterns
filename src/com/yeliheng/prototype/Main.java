package com.yeliheng.prototype;

/**
 * 原型模式
 */
public class Main {
    public static void main(String[] args) {

        Printer obj1 = new Printer("A4","Hello,World");
        obj1.display();

        Printer obj2 = (Printer) obj1.clone();
        obj2.setPaperType("A3");
        obj2.display();
    }
}
