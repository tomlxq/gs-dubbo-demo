package com.tom;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述
 *
 * @author TomLuo
 * @date 2019/12/28
 */
@Slf4j
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public DoOrderRes doOrder(DoOrderReq doOrderReq) {
        log.info("客户端过来的请求数据：{}",JSON.toJSONString(doOrderReq));
        DoOrderRes doOrderRes = new DoOrderRes();
        doOrderRes.setReturnCode("000");
        doOrderRes.setReturnDesc("下订单成功");
        return doOrderRes;
    }
}
