package com.soft1851.spring.ioc.entity;

import com.soft1851.spring.ioc.config.StudentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/beans.xml"})
@ContextConfiguration(classes = {StudentConfig.class})
public class StudentTest {
    private Logger logger =  LoggerFactory.getLogger(StudentTest.class);
@Autowired
    private Student student;
@Autowired
private  Student studentOne;

    @Test
    public void print() {
        System.out.println(student);
    }

    @Test
    public void testStudent() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) ac.getBean("student") ;
        logger.info(student.toString());
    }
    @Test
    public void studentConfig() {
        System.out.println(studentOne);
    }
}