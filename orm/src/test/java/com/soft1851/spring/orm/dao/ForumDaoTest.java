package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.config.JdbcConfig;
import com.soft1851.spring.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//使用注解版本
@ContextConfiguration(classes = {JdbcConfig.class})
//使用xml文件的版本
//@ContextConfiguration(locations = {"/applicationContent.xml"})
public class ForumDaoTest {
    @Autowired
    private ForumDao forumDao;

    @Test
    public void insert() {
        Forum forum = new Forum();
        forum.setForumName("张三");
        int n = forumDao.insert(forum);
        System.out.println(n);
    }

    @Test
    public void batchInsert() {
        Forum forum1 = new Forum();
        forum1.setForumName("李四");
        Forum forum2 = new Forum();
        forum2.setForumName("王五");
        Forum forum3 = new Forum();
        forum3.setForumName("赵六");
        List<Forum> list = new ArrayList<>();
        list.add(forum1);
        list.add(forum2);
        list.add(forum3);
        int[] rows = forumDao.batchInsert(list);
        assertEquals(3, rows.length);

    }

    @Test
    public void delete() {
        int n = forumDao.delete(1);
        assertEquals(1, n);
    }

    @Test
    public void updata() {
        Forum forum = forumDao.get(3);
        forum.setForumName("测试论坛修改新的名称");
        int n = forumDao.update(forum);
        System.out.println(n);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(4);
        assertNotNull(forum);
    }

    @Test
    public void sellectAll() {
        List<Forum> forums = forumDao.sellectAll();
        assertEquals(13, forums.size());
    }
}