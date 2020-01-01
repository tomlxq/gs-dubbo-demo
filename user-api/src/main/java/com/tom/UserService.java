package com.tom;

/**
 * 用户登陆模块
 *
 * @author TomLuo
 * @date 2020/1/1
 */
public interface UserService {
    /**
     * 用户登陆
     * @param loginRequest 请求参数
     * @return 响应参数
     */
    LoginResponse login(LoginRequest loginRequest);
}
