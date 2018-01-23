package com.lrlz.springcloud.orderservice.service;


import com.lrlz.springcloud.orderservice.domain.Order;

import java.util.List;

/**
 *
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
public interface OrderService {

    Order getById(Integer id);

    List<Order> listByUser(Integer userId);

    List<Order> listByStatus(Integer status);

    int add(Order order);

    void deleteById(Integer id);

}
