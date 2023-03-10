package com.ioc.service.Impl;

import com.ioc.service.Calculators;
import org.springframework.stereotype.Service;

@Service
public class CalculatorDivide implements Calculators {
    @Override
    public double ufunc(double number1, double number2) {
        return number1 / number2;
    }
}
