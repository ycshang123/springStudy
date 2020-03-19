package com.soft1851.spring.ioc.config;/*@ClassName UserConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.User;
import com.soft1851.spring.ioc.entity.UserLogin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.soft1851.spring.ioc"})
public class UserConfig {
    @Bean
    public User userOne(){
        User user = new User();
        user.setAccount("盏茶浅抿");
        user.setPassword("123123");
        return  user;
    }

    @Bean
    public Boolean userLoginOne(){
        Boolean status;
        UserLogin userLogin = new UserLogin();
        User user = new User();
        user.setAccount("admin");
        user.setPassword("111");
       status= userLogin.userLogin(user);
        return status;
    }
}
