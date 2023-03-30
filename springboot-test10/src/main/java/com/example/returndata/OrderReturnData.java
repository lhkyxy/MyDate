package com.example.returndata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReturnData {
    private Integer status;
    private String info;
    private String data;
}
