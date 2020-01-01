package com.tom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2020/1/1
 */
@Setter
@Getter
@AllArgsConstructor
public class LoginRequest implements Serializable {
    private static final long serialVersionUID = 3009664017273121668L;
    private String name;
    private String password;
}
