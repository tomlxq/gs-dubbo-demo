package com.tom;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2019/12/28
 */
@Slf4j
@Service("orderQueryService2")
public class OrderQueryService2Impl implements OrderQueryService {
    @Override
    public String query(String name) {
        log.info("客户端过来的请求数据：{}",JSON.toJSONString(name));
        return String.format(Locale.ROOT,"hello,version2,I'm %s",name);
    }
}
