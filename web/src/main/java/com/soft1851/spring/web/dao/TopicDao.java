package com.soft1851.spring.web.dao;/*@ClassName TopicDao
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/26
 *@Version 1.0
 **/

import com.soft1851.spring.web.entity.Topic;

import java.util.List;

public interface TopicDao {
    List<Topic> selectAll();
    int[] batchInsert(List<Topic> topics);
    int insert(Topic topic);
}
