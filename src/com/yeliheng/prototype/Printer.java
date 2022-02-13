package com.yeliheng.prototype;

/**
 * 打印机原型
 */
public class Printer implements Cloneable {

    private String paperType; //纸张类型

    private String content; //打印内容

    public Printer(String paperType, String content) {
        this.paperType = paperType;
        this.content = content;
        System.out.println("打印机准备就绪！");
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println(" 纸张类型: " + paperType + " \n 打印内容: " + content);
    }

    @Override
    public Printer clone() {
        try {
            return (Printer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
