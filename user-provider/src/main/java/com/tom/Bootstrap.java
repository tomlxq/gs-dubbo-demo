package com.tom;

import com.alibaba.dubbo.container.Main;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2020/1/1
 */
public class Bootstrap {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        Main.main(args);
    }
}
