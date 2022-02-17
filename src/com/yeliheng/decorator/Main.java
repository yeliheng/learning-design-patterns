package com.yeliheng.decorator;

public class Main {
    public static void main(String[] args) {
        ImageCaptcha imageCaptcha = new ImageCaptcha(new SmsCaptcha(new LoginComponentImpl()));
        imageCaptcha.login();
    }
}
