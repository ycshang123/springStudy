package com.soft1851.spring.web.config;/*@ClassName WebApplicationConfig
 *@Description:web应用配置，替代之前的web.xml
 *@author yc_shang
 *@Date2020/3/24
 *@Version 1.0
 **/

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class WebApplicationConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //创建一个基于注解的web应用的上下文配置对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
         //将webMvcConfig的配置类注册进来
        ctx.register(WebMvcConfig.class);
        //设置servletContext
        ctx.setServletContext(servletContext);
        ctx.refresh();
        //配置了ctx的映射规则
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        //添加规则
        registration.addMapping("/");
        //设置该servlet的启动优先级
        registration.setLoadOnStartup(1);
    }
}
