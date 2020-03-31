package com.soft1851.spring.mybatis.Dto;/*@ClassName MatterDto
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatterDto {
    private  String teacherName;
    private String clazzName;
    private String studentName;
    private Student student;
}
