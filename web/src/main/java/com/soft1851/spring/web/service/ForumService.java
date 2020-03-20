package com.soft1851.spring.web.service;/*@ClassName ForumService
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.soft1851.spring.web.entity.Forum;

import java.util.List;

public interface ForumService {
    //查询所有Forum
    List<Forum> selectAll();
    //根据id查找Forum
    Forum get(int forumId);
}
