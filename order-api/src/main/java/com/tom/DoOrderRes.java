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
public class DoOrderRes implements Serializable {
    private static final long serialVersionUID = 1249320143365638280L;
    private String returnCode;
    private String returnDesc;
    private Object data;
}
