package com.tom;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2019/12/28
 */
@Setter
@Getter
public class DoOrderReq implements Serializable {
    private static final long serialVersionUID = -2466295291144760322L;
    private String name;
}
