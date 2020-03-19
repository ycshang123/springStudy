package com.soft1851.spring.ioc.config;/*@ClassName AppConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.soft1851.spring.ioc"})
public class BookConfig {
    @Bean
    public Book bookOne(){
        Book book = new Book();
        book.setId(1);
        book.setName("零基础学Java");
        book.setPrice(36.6);
        return  book;
    }
}
