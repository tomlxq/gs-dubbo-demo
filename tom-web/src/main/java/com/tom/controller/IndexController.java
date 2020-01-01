package com.tom.controller;


import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.fastjson.JSON;
import com.tom.DoOrderReq;
import com.tom.DoOrderRes;
import com.tom.LoginRequest;
import com.tom.LoginResponse;
import com.tom.OrderQueryService;
import com.tom.OrderService;
import com.tom.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2019/12/30
 */
@RestController
@Slf4j
public class IndexController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderQueryService orderQueryService;
    @Autowired
    @Qualifier(value = "orderQueryService2")
    private OrderQueryService orderQueryService2;
    @Autowired
    private UserService userService;
    @RequestMapping
    public DoOrderRes index(){
        DoOrderReq doOrderReq = new DoOrderReq();
        doOrderReq.setName("大众汽车");
        DoOrderRes doOrderRes = orderService.doOrder(doOrderReq);
        System.out.println(JSON.toJSONString(doOrderRes));
        System.out.println(JSON.toJSONString( orderQueryService.query("jack")));
        orderQueryService2.query("jack");
        Future<Object> future = RpcContext.getContext().getFuture();
        try {
            System.out.println(JSON.toJSONString( future.get()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return doOrderRes;
    }

    @RequestMapping("/login")
    public LoginResponse login(@RequestParam String name,@RequestParam String password){
        LoginRequest loginRequest = new LoginRequest(name, password);
        log.info("门户登陆："+JSON.toJSONString(loginRequest));
        LoginResponse login = userService.login(loginRequest);
        return login;
    }

}
