package com.soft1851.spring.ioc.config;/*@ClassName StudentConfig
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.soft1851.spring.ioc.entity.Book;
import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = {"com.soft1851.spring.ioc"})
public class StudentConfig {
    @Bean
    public Student studentOne(){
        Student student = new Student();
        List<String> list = new ArrayList<>();
        list.add("羽毛球");
        list.add("足球");
        list.add("乒乓球");
        List<Phone> list1 = new ArrayList<>();
        list1.add(new Phone("小米10",2999.9));
        list1.add(new Phone("华为nova5",3666.6));
        Set<Book> set = new HashSet<>();
        set.add(new Book(1,"皮囊",26.6));
        set.add(new Book(2,"活着",36.6));
        Map<Integer,Phone> map = new HashMap<>();
        map.put(1,new Phone("小米10",2999.9));
        map.put(2,new Phone("华为nova5",3666.6));
        student.setId(1);
        student.setName("盏茶浅抿");
        student.setHobby(list);
        student.setEquip(list1);
        student.setBooks(set);
        student.setEquipMap(map);
        return student;
    }
}
