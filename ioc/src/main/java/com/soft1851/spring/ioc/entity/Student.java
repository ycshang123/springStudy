package com.soft1851.spring.ioc.entity;/*@ClassName Student
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/12
 *@Version 1.0
 **/

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private  Integer id;
    private String name;
    private List<String> hobby;
    private List<Phone> equip;
    private Set<Book>  books;
    private Map<Integer,Phone> equipMap;

    public Student(Integer id, String name, List<String> hobby, List<Phone> equip, Set<Book> books, Map<Integer, Phone> equipMap) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.equip = equip;
        this.books = books;
        this.equipMap = equipMap;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Student() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public List<Phone> getEquip() {
        return equip;
    }

    public void setEquip(List<Phone> equip) {
        this.equip = equip;
    }

    public Map<Integer, Phone> getEquipMap() {
        return equipMap;
    }

    public void setEquipMap(Map<Integer, Phone> equipMap) {
        this.equipMap = equipMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", equip=" + equip +
                ", books=" + books +
                ", equipMap=" + equipMap +
                '}';
    }
}
