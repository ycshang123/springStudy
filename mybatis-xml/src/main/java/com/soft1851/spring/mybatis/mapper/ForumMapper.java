package com.soft1851.spring.mybatis.mapper;/*@ClassName ForumMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/30
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Forum;

import java.util.List;

public interface ForumMapper {
    //新增实体
    void insert (Forum forum);
    //根据id删除
    void delete(int id);
    //修改
    void update(Forum forum);
    //查询所有
    List<Forum> selectAll();
    //根据id查询Forum
    Forum selectForumById(int id);
}
