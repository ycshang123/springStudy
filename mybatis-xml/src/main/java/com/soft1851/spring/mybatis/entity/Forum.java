package com.soft1851.spring.mybatis.entity;/*@ClassName Forum
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/30
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
public class Forum {
    private  Integer forumId;
    private  String forumName;
}
