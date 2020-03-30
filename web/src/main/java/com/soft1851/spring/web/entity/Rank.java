package com.soft1851.spring.web.entity;/*@ClassName Rank
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
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
public class Rank {
    private  String title;
    private String author;
    private String pic;
    private String duration;
}
