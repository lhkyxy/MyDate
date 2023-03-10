package com.ioc.controller;

import com.ioc.service.Calculators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {
    //创建接口对象
    private Calculators calculators;

    //get 方法
    public Calculators getCalculators() {
        return calculators;
    }

    //set 方法
    public void setCalculators(Calculators calculators) {
        this.calculators = calculators;
    }

}
