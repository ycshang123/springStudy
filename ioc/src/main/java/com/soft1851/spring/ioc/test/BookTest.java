package com.soft1851.spring.ioc.test;/*@ClassName BookTest
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.config.BookConfig;
import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用文上下文件对象
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(BookConfig.class);
//        acac.scan("com.soft1851.spring.ioc.config");
//        acac.refresh();
        Book book = (Book)acac.getBean("bookOne");
        System.out.println(book);
    }
}
