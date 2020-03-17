package com.soft1851.spring.ioc.entity;/*@ClassName UserLogin
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/12
 *@Version 1.0
 **/

public class UserLogin {
    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user){
        boolean result;
        String account ="admin";
        String password = "111";
        result = account.equals(user.getAccount()) && password.equals(user.getPassword());
        return result;
    }
}
