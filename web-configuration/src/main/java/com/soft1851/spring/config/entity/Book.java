package com.soft1851.spring.config.entity;/*@ClassName Book
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
public class Book {
    private Integer id;
    private  Double price;
    private  String bookName;
    private  String img;
}

