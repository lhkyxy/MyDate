package com.example.mapper;

import com.example.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    Integer add(@Param(value = "order") Order order);

    Integer del(Integer orderId);

    Integer update (@Param(value = "order") Order order);

    Order findById(Integer orderId);

    List<Order> findAll();
}
