package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//使用xml配置版的注解
@ContextConfiguration(locations = {"/applicationContext.xml"})
//使用注解配置的注解
//@ContextConfiguration(classes = {JdbcConfig.class})
public class PostDaoTest {
    @Autowired
    private PostDao postDao;
    @Test
    public void insert() {
        Post post = new Post();
        post.setTitle("第一个标题");
        post.setContext("这是一段内容");
//        post.setThumbnail(FileUtil.fileToURL(new File(path))));
        post.setForumId(1);
        post.setPostTime(new Timestamp(System.currentTimeMillis()));
        int n = postDao.insert(post);
        System.out.println(n);

    }

    @Test
    public void batchInsert() {
        Post post1 = new Post();
        post1.setPostId(2);
        post1.setForumId(2);
        post1.setTitle("第二个标题");
        post1.setContext("这是一段内容");
        post1.setPostTime(new Timestamp(System.currentTimeMillis()));
        Post post2 = new Post();
        post2.setPostId(3);
        post2.setForumId(3);
        post2.setTitle("第三个标题");
        post2.setContext("这是一段内容");
        post2.setPostTime(new Timestamp(System.currentTimeMillis()));
        Post post3 = new Post();
        post3.setPostId(4);
        post3.setForumId(4);
        post3.setTitle("第四个标题");
        post3.setContext("这是一段内容");
        List<Post> list = new ArrayList<>();
        post3.setPostTime(new Timestamp(System.currentTimeMillis()));
        list.add(post1);
        list.add(post2);
        list.add(post3);
        int[] rows = postDao.batchInsert(list);
        System.out.println(rows.length);

    }

    @Test
    public void delete() {
        int n = postDao.delete(1);
        System.out.println(n);
    }

    @Test
    public void get() {
        Post post = postDao.get(2);
        System.out.println(post);
    }


    @Test
    public void selectByKey() {
        List<Post> postList = postDao.selectByKey("标题");
        postList.forEach(item -> System.out.println(item.getPostId()));
    }


    @Test
    public void count() {
        int i = 3;
        System.out.println(postDao.count(i));
    }
}