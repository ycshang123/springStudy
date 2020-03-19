package com.soft1851.spring.ioc.entity;

import com.soft1851.spring.ioc.config.UserConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/beans.xml"})
@ContextConfiguration(classes = {UserConfig.class})
public class UserTest {
//    @Autowired
//    private User user;
//    @Autowired
//    private  User user1;
//    @Autowired
//    private  UserLogin userLogin;
//    @Autowired
//    private UserLogin userLogin1;
    @Autowired
    private  User userOne;
    @Autowired
    private  boolean userLoginOne;

@Test
    public  void userOne(){
    System.out.println(userOne);
}
@Test
    public  void userLogin(){
    System.out.println(userLoginOne);
    if(userLoginOne){

        System.out.println("登录成功");
    }else{
        System.out.println("登陆失败");
    }
}
//    @Test
//    public void login() {
//        if( userLogin.userLogin(user)){
//            System.out.println("登录成功");
//        }else {
//            System.out.println("登陆失败");
//        }
//        if(userLogin1.userLogin(user1)){
//            System.out.println("登录成功");
//        }else{
//            System.out.println("登陆失败");
//        }
//    }

}