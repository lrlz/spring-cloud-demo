package com.lrlz.springcloud.userservice.feign.order;

import com.lrlz.commons.entity.OrderVO;
import com.lrlz.springcloud.userservice.feign.order.fallback.OrderServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 *
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
@FeignClient(value = "OrderService", fallback = OrderServiceImpl.class)
public interface OrderService {

    @GetMapping("/order/feign/{user-id}")
    List<OrderVO> getByUser(@PathVariable("user-id") Integer userId);

}
