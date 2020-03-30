package com.soft1851.spring.web.service;/*@ClassName TopicService
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/27
 *@Version 1.0
 **/

import com.soft1851.spring.web.entity.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> queryAll();
    void addTopic(Topic topic);
    int[] batchInsert(List<Topic> topics);
}
