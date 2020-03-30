package com.soft1851.spring.config.entity;/*@ClassName Card
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/24
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
public class Card {
    private Integer number;
    private  String cover;
}
