package com.soft1851.spring.ioc.entity;/*@ClassName Student
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/12
 *@Version 1.0
 **/

import java.util.List;

public class Student {
    private  Integer id;
    private String name;
    private List<String> hobby;
    private List<Phone> equip;

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


    public Student(Integer id, String name, List<String> hobby, List<Phone> equip) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.equip = equip;
    }

    public List<Phone> getEquip() {
        return equip;
    }

    public void setEquip(List<Phone> equip) {
        this.equip = equip;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", equip=" + equip +
                '}';
    }
}
