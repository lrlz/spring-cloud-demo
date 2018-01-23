package com.lrlz.springcloud.userservice.controller;

import com.lrlz.commons.entity.OrderVO;
import com.lrlz.commons.response.BaseResult;
import com.lrlz.springcloud.userservice.feign.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
@RestController
@RequestMapping("/user-order")
public class UserOrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public BaseResult myOrder(@PathVariable("id") Integer id) {
        List<OrderVO> myOrders = orderService.getByUser(id);
        return BaseResult.success(myOrders);
    }
}
