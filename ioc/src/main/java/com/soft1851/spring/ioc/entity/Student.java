package com.soft1851.spring.ioc.entity;/*@ClassName Student
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/12
 *@Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private  Integer id;
    private String name;
    private List<String> hobby;
    private List<Phone> equip;
    private Set<Book>  books;
    private Map<Integer,Phone> equipMap;
}
