package com.soft1851.spring.orm.config;/*@ClassName JdbcConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
@ComponentScan(basePackages = "com.soft1851.spring.orm")
public class JdbcConfig {
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/bbs?useUnicode=true&characterEncoding=utf8&useSSL=false&autoReconnect=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        //配置初始化大小、最大、最小
        druidDataSource.setInitialSize(1);
        druidDataSource.setMinIdle(1);
        druidDataSource.setMaxActive(20);
        //配置获取连接等待超时的时间
        druidDataSource.setMaxWait(60000);
        //配置间隔多久才能进行一次检测，检测需要关闭的空闲连接；单位是毫秒
        druidDataSource.setTimeBetweenConnectErrorMillis(300000);
        //禁止自动提交，实现事务管理
        druidDataSource.setDefaultAutoCommit(false);
        //设置连接池启用预处理事务集
        druidDataSource.setPoolPreparedStatements(true);
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        return new JdbcTemplate(druidDataSource);
    }
//    @Bean
////    public ForumDao forumDao(JdbcTemplate jdbcTemplate){
//        return  new ForumDaoImpl(jdbcTemplate);
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        DruidDataSource dataSource = (DruidDataSource)acac.getBean("dataSource");
//        System.out.println(dataSource);
//        JdbcTemplate jdbcTemplate = (JdbcTemplate)acac.getBean("jdbcTemplate");
//        String sql = "SELECT * FROM t_post";
//        List<Post> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Post.class));
//        list.forEach(System.out::println);
//    }
}
