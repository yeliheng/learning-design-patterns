package com.yeliheng.templatemethod;

/**
 * 抽象模板
 */
public abstract class Policy {
    public void TemplateMethod() {
        agreePrivacyPolicy();
        agreeOperationPolicy();
        disclaimer();
        if(agreeResult()) {
            System.out.println("签署成功!");
        }else {
            System.out.println("签署失败!");
        }
    }

    //隐私协议
    public void agreePrivacyPolicy() {
        System.out.println("您正在签署[隐私协议]，以下是协议内容：（1）...（2）...（3）...");
    }

    //操作协议
    public void agreeOperationPolicy() {
        System.out.println("您正在签署[操作协议]，以下是协议内容：（1）...（2）...（3）...");
    }

    //应用免责声明
    public void disclaimer() {
        System.out.println("[免责声明]: （1）...（2）...（3）...");
    }

    public abstract boolean agreeResult();

}
