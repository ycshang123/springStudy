package com.soft1851.spring.ioc.config;/*@ClassName PhoneConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfig {
    @Bean
    public Phone phone(){
        Phone phoneConfig = new Phone();
        phoneConfig.setBrand("ipbone11");
        phoneConfig.setPrice(6666.6);
        return  phoneConfig;
    }

}
