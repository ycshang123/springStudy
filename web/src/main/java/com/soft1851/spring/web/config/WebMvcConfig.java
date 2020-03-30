package com.soft1851.spring.web.config;/*@ClassName WebMvcConfig
 *@Description:用户自定义配置类
 *@author yc_shang
 *@Date2020/3/24
 *@Version 1.0
 **/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
@ComponentScan("com.soft1851.spring.web")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
 //配置视图解析器
    @Bean
    public SpringResourceTemplateResolver springResourceTemplateResolver(){
        return  new SpringResourceTemplateResolver();
    }

    private ITemplateResolver templateReslover(){
        springResourceTemplateResolver().setPrefix("classpath:/templates/");
        springResourceTemplateResolver().setSuffix(".html");
        springResourceTemplateResolver().setTemplateMode(TemplateMode.HTML);
        springResourceTemplateResolver().setCharacterEncoding("UTF-8");
        return  springResourceTemplateResolver();
    }

    @Bean
    public ViewResolver viewResolver(){
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine((ISpringTemplateEngine) templateEngine());
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }
    @Bean
    public TemplateEngine templateEngine(){
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateReslover());
        return engine;
    }
}
