package com.example.service.impl;

import com.example.mapper.OrderMapper;
import com.example.pojo.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Boolean add(Order order) {
        return orderMapper.add(order) > 0;
    }

    @Override
    public Boolean del(Integer orderId) {
        return orderMapper.del(orderId) > 0;
    }

    @Override
    public Boolean update(Order order) {
        return orderMapper.update(order) > 0;
    }

    @Override
    public Order findById(Integer orderId) {
        return orderMapper.findById(orderId);
    }

    @Override
    public List<Order> findAll() {
        return orderMapper.findAll();
    }
}
