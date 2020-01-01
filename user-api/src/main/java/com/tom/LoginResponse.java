package com.tom;


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
public class LoginResponse implements Serializable {
    private static final long serialVersionUID = 7914574507819452929L;
    String returnCode;
    String returnDesc;
    Object data;
}
