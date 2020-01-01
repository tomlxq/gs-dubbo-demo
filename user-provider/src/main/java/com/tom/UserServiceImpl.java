package com.tom;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2020/1/1
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        log.info("登陆服务请求：{}", JSON.toJSONString(loginRequest));
        loginResponse.setReturnCode("0");
        loginResponse.setReturnDesc("登陆成功");
        return loginResponse;
    }
}
