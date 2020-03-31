package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.Dto.MatterDto;
import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class MatterVoMapperTest {
@Resource
private MatterVoMapper matterVoMapper;
    @Test
    public void selectLimitFromTeacherClassByDynamicSql() {
//        MatterDto matterDto = MatterDto.builder().teacherName("许老师").clazzName("软件1851").studentName("王锋").build();
//        matterVoMapper.selectLimitFromTeacherClassByDynamicSql(matterDto).forEach(System.out::println);
//
        MatterDto matterDto = MatterDto.builder().teacherName("许老师").clazzName("软件1851")
                .student(new Student("王")).build();
        matterVoMapper.selectLimitFromTeacherClassByDynamicSql(matterDto).forEach(System.out::println);
    }
}