package com.soft1851.spring.ioc.config;/*@ClassName SortConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Sort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.soft1851.spring.ioc"})
public class SortConfig {
    @Bean
    public  int[] sortBubbleSort(){
        Sort sort = new Sort();
        int arr[] = sort.bubbleSort();
        for(int i =0; i<arr.length;i++){
//            System.out.println(arr[i]);
        }
        return  arr;
    }
    @Bean
    public  int[] sortSelect(){
        Sort sort = new Sort();
        int arr[] = sort.selectSort();
        for(int i =0; i<arr.length;i++){
//            System.out.println(arr[i]);
        }
        return  arr;
    }
}

