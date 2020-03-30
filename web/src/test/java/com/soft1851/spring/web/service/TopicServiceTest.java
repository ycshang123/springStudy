package com.soft1851.spring.web.service;

import com.soft1851.spring.web.config.JdbcConfig;
import com.soft1851.spring.web.spider.JueJinSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JdbcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TopicServiceTest {
@Autowired
private  TopicService topicService;
    @Test
    public void queryAll() {
    }

    @Test
    public void addTopic() {
    }

    @Test
    public void batchInsert() {
        int[] ints = topicService.batchInsert(JueJinSpider.getTopics());
        System.out.println(ints.length);
        assertEquals(JueJinSpider.getTopics().size(),ints.length);
    }
}