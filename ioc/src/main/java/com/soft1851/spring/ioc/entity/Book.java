package com.soft1851.spring.ioc.entity;/*@ClassName Book
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

public class Book {
    private Integer id;
    private String name;
    private  Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
