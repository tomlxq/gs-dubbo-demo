package com.tom;


import com.alibaba.dubbo.container.Main;

public class App2 {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        Main.main(args);
    }
}
