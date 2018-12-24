package com.fmy.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author ws47033
 * @date 2018/12/24 21:41
 */


public class Car {

    @Value("${brand}")
    private String brand;

    @Value("#{500000-3000}")
    private double price;

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
