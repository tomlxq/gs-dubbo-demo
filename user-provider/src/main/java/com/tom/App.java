package com.tom;

import com.alibaba.fastjson.JSON;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
       OrderService orderService = (OrderService) context.getBean("orderService");
        DoOrderReq doOrderReq = new DoOrderReq();
        doOrderReq.setName("大众汽车");
        DoOrderRes doOrderRes = orderService.doOrder(doOrderReq);
        System.out.println(JSON.toJSONString(doOrderRes));
       /* OrderQueryService orderQueryService = (OrderQueryService) context.getBean("orderQueryService");
        for(int idx=0;idx<20;idx++) {
            System.out.println(orderQueryService.query("jack"));
        }*/
        System.in.read();
    }
}
