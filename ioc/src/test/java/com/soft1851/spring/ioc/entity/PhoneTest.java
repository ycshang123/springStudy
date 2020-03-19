package com.soft1851.spring.ioc.entity;

import com.soft1851.spring.ioc.config.PhoneConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/beans.xml"})
@ContextConfiguration(classes={PhoneConfig.class})
public class PhoneTest {
    @Autowired
    private  Phone phone;
    @Autowired
    Phone phoneOne;
    //phone的xml测试
    @Test
    public void print() {
        System.out.println(phone);
    }
    //phone的注解测试
    @Test
    public void phoneOne() {
        System.out.println(phoneOne);
    }


}