package com.example.controller;

import com.example.pojo.Order;
import com.example.returndata.OrderReturnData;
import com.example.returndata.OrderReturnFindAllData;
import com.example.returndata.OrderReturnFindData;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderReturnData add(@RequestBody Order order){
        OrderReturnData orderReturnData = new OrderReturnData(200,"添加数据","失败!");
        Boolean isOk = orderService.add(order);
        if(isOk==true){
            orderReturnData.setData("成功！");
        }
        return orderReturnData;
    }

    @DeleteMapping("/{orderId}")
    public OrderReturnData del(@PathVariable Integer orderId){
        OrderReturnData orderReturnData = new OrderReturnData(200,"删除数据","失败!");
        Boolean isOk = orderService.del(orderId);
        if(isOk==true){
            orderReturnData.setData("成功！");
        }
        return orderReturnData;
    }

    @PutMapping
    public OrderReturnData update(@RequestBody Order order){
        OrderReturnData orderReturnData = new OrderReturnData(200,"修改数据","失败!");
        Boolean isOk = orderService.update(order);
        if(isOk==true){
            orderReturnData.setData("成功！");
        }
        return orderReturnData;
    }

    @GetMapping("/{orderId}")
    public OrderReturnFindData findById(@PathVariable Integer orderId){
        Order order = orderService.findById(orderId);
        OrderReturnFindData orderReturnFindData = new OrderReturnFindData(200,"查询数据",order);
        return orderReturnFindData;
    }

    @GetMapping
    public OrderReturnFindAllData findALl(){
        List<Order> list = orderService.findAll();
        OrderReturnFindAllData orderReturnData = new OrderReturnFindAllData(200,"查询所有数据",list);
        return orderReturnData;
    }
}
