package com.soft1851.spring.ioc.entity;/*@ClassName PhoneTest
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/12
 *@Version 1.0
 **/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Phone phone = (Phone)ac.getBean("phone");
        System.out.println(phone);
    }
}
