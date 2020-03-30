package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.config.JdbcConfig;
import com.soft1851.spring.web.spider.DribbbleSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JdbcConfig.class)
@WebAppConfiguration("src/main/resources")
public class DribbbleDaoTest {
@Autowired
private DribbbleDao dribbbleDao;
    @Test
    public void sellectAll() {
        System.out.println(dribbbleDao.sellectAll().size());
    }

    @Test
    public void batchInsert() {
    int[] ints = dribbbleDao.batchInsert(DribbbleSpider.getDribbble());
        System.out.println(ints.length);
    }
}