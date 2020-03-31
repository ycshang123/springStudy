package com.soft1851.spring.mybatis.entity;/*@ClassName Student
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Integer studentId;
    private Integer clazzId;
    private  String studentName;
    private String hometown;
    private LocalDate birthday;
    private Clazz clazz;
    private List<Course> courses;
    public Student(String studentName) {
        this.studentName = studentName;
    }
}
