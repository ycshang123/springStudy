package com.soft1851.spring.ioc.dao;/*@ClassName PostDao
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Post;

import java.util.List;

public interface PostDao {
    //新增Post
    int insert(Post post);
    //批量新增Post
    int[] batchInsert(List<Post> posts);
    //根据id删除Post
    int delete(int postId);
    //根据id查询Post
    Post get(int postId);
    //根据关键字查询post
    List<Post> selectByKey(String key);
    int count(Integer forumId);
}
