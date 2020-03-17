package com.soft1851.spring.ioc.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans.xml"})
public class UserTest {
    @Autowired
    private User user;
    @Autowired
    private  User user1;
    @Autowired
    private  UserLogin userLogin;
    @Autowired
    private UserLogin userLogin1;

    @Test
    public void login() {
        if( userLogin.userLogin(user)){
            System.out.println("登录成功");
        }else {
            System.out.println("登陆失败");
        }
        if(userLogin1.userLogin(user1)){
            System.out.println("登录成功");
        }else{
            System.out.println("登陆失败");
        }
    }

}