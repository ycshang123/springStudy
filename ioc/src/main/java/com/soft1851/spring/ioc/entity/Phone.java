package com.soft1851.spring.ioc.entity;/*@ClassName Phone
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/12
 *@Version 1.0
 **/

public class Phone {
    private String brand;
    private Double price;

    public Phone() {
    }

    public Phone(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
