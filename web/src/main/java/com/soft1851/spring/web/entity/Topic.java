package com.soft1851.spring.web.entity;/*@ClassName Topic
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/26
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
public class Topic {
    private String id;
    private String topicName;
    private String topicIcon;
    private Integer follwersCount;
    private  Integer msgCount;
    private   Boolean followed;
    private  String description;

}
