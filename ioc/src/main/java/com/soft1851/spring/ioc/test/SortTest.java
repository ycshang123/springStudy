package com.soft1851.spring.ioc.test;/*@ClassName SortTest
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/10
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SortTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
       Sort sort =(Sort) ac.getBean("sort");
       int arr [] = sort.bubbleSort();
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }

    }
}
