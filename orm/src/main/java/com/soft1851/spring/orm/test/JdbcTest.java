package com.soft1851.spring.orm.test;/*@ClassName JdbcTest
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.soft1851.spring.orm.config.JdbcConfig;
import com.soft1851.spring.orm.entity.Post;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JdbcConfig.class);
        acac.scan("com.soft1851.spring.ioc.config");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) acac.getBean("jdbcTemplate") ;
        System.out.println(jdbcTemplate);
        String sql = "SELECT * FROM t_post";
        List<Post> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Post.class));
        list.forEach(System.out::println);
    }
}
