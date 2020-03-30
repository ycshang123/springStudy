package com.soft1851.spring.mybatis.service;/*@ClassName ForumService
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/30
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Forum;

import java.util.List;

public interface ForumService {
    void insert(Forum forum);
    void delete(int id);
    void update(Forum forum);
    List<Forum> selectAll();
    Forum selectForumById(int id);
}
