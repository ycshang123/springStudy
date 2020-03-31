package com.soft1851.spring.mybatis.entity;/*@ClassName CourseStudent
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
    private Integer id;
    private Integer courseId;
    private  Integer studentId;
}
