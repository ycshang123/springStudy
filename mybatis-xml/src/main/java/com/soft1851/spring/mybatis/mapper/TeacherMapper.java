package com.soft1851.spring.mybatis.mapper;/*@ClassName TeacherMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Teacher;

public interface TeacherMapper {
    /**
     * 根据teacherId一对一关联查询其管理的班级信息
     */
    Teacher getTeacherOneToOne(int teacherId);
}
