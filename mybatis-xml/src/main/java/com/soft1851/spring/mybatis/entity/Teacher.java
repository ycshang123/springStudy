package com.soft1851.spring.mybatis.entity;/*@ClassName Teacher
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    private  Integer teacherId;
    private String teacherName;
    private  Integer clazzId;
    private  Clazz clazz;


}
