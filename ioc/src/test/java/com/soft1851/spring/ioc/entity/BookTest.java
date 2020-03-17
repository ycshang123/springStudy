package com.soft1851.spring.ioc.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans.xml"})
public class BookTest {
    @Autowired
    private  Book bookOne;
    @Test
    public void testBook() {
        bookOne.setId(1);
        bookOne.setName("零基础学Java");
        bookOne.setPrice(66.6);
        System.out.println(bookOne);

    }



}