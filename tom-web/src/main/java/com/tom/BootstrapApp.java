package com.tom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

@ImportResource(locations = {"classpath:application-dubbo.xml"})
public class BootstrapApp {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApp.class, args);

    }
}
