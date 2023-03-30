package com.example.returndata;

import com.example.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReturnFindData {
    private Integer status;
    private String info;
    private Order order;
}
