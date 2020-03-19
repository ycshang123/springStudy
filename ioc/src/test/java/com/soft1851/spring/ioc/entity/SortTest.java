package com.soft1851.spring.ioc.entity;

import com.soft1851.spring.ioc.config.SortConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SortConfig.class})
public class SortTest {
    @Autowired
    private  int[] sortBubbleSort;
    @Autowired
    private  int [] sortSelect;

    @Test
    public void bubbleSort() {
        System.out.println(sortBubbleSort);
    }

    @Test
    public void selectSort() {
        System.out.println(sortSelect);
    }
}