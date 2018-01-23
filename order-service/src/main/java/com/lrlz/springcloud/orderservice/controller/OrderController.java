package com.lrlz.springcloud.orderservice.controller;

import com.lrlz.commons.response.BaseResult;
import com.lrlz.springcloud.orderservice.domain.Order;
import com.lrlz.springcloud.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * OrderController
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public BaseResult getById(@PathVariable("id") Integer id) {
        Order order = orderService.getById(id);
        return BaseResult.success(order);
    }

    @GetMapping("/feign/{user-id}")
    public List<Order> getByUserId(@PathVariable("user-id") Integer userId) {
        List<Order> orders = orderService.listByUser(userId);
        Order order = new Order();
        order.setId(3);
        order.setCreateTime(new Date());
        order.setPayment(10L);
        orders.add(order);
        return orders;
    }

    @DeleteMapping("/{id}")
    public BaseResult deleteById(@PathVariable("id") Integer id) {
        orderService.deleteById(id);
        return BaseResult.succeed();
    }

}
