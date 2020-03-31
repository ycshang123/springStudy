package com.soft1851.spring.mybatis.vo;/*@ClassName MatterVo
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
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatterVo {
    private String teacherName;
    private String clazzName;
    private String studentName;
    private  String hometown;
    private String birthday;
}
