package com.lrlz.springcloud.userservice.feign.order.fallback;/**
 * @author 1290650611@qq.com
 * @cteate 2018/1/14
 */


import com.lrlz.commons.entity.OrderVO;
import com.lrlz.springcloud.userservice.feign.order.OrderService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * OrderServiceFallback
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public List<OrderVO> getByUser(Integer userId) {
        System.out.print("into fallback=====");
        return null;
    }
}
