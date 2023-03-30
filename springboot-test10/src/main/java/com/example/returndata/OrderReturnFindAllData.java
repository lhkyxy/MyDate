package com.example.returndata;

import com.example.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReturnFindAllData {
    private Integer status;
    private String info;
    private List<Order> list;
}
