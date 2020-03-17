package com.soft1851.spring.ioc.config;/*@ClassName AppConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Book bookOne(){
        return  new Book();
    }
}
