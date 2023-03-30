package com.example.service;

import com.example.pojo.Order;

import java.util.List;

public interface OrderService {
    Boolean add(Order order);

    Boolean del(Integer orderId);

    Boolean update(Order order);

    Order findById(Integer orderId);

    List<Order> findAll();
}
