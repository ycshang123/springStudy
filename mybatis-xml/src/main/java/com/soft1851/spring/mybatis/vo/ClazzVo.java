package com.soft1851.spring.mybatis.vo;/*@ClassName ClazzVo
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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClazzVo {
    private Integer clazzId;
    private  String clazzName;
    private  Integer teacherId;
    private  Integer studentId;
    private  String studentName;
    private  String homeTown;
    private LocalDate birthday;
}
