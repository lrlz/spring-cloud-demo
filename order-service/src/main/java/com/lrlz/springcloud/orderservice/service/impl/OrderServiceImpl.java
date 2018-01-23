package com.lrlz.springcloud.orderservice.service.impl;

import com.lrlz.springcloud.orderservice.dao.OrderMapper;
import com.lrlz.springcloud.orderservice.domain.Order;
import com.lrlz.springcloud.orderservice.domain.OrderCriteria;
import com.lrlz.springcloud.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * OrderServiceImpl
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/14
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order getById(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Order> listByUser(Integer userId) {
        OrderCriteria criteria = new OrderCriteria();
        criteria.setOrderByClause("create_time");
        criteria.createCriteria().andUserIdEqualTo(userId);
        return orderMapper.selectByExample(criteria);
    }

    @Override
    public List<Order> listByStatus(Integer status) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int add(Order order) {
        orderMapper.insert(order);
        return order.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Integer id) {
        orderMapper.deleteByPrimaryKey(id);
    }
}
