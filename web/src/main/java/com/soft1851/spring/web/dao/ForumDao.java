package com.soft1851.spring.web.dao;/*@ClassName ForumDao
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

import com.soft1851.spring.web.entity.Forum;

import java.util.List;

public interface ForumDao {
    //新增Forum
    int insert(Forum forum);
    //批量新增Forum
    int[] batchInsert(List<Forum> forums);
    //根据id删除Forum
    int delete(int forumId);
    //修改Forum
    int update(Forum forum);
    //根据id查询Forum
    Forum get(int forumId);
    //查询所有论坛信息
    List<Forum> selectAll();
}
