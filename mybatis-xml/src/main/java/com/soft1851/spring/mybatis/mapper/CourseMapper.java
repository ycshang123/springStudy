package com.soft1851.spring.mybatis.mapper;/*@ClassName CourseMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/1
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Course;

public interface CourseMapper {
    /**
     * 根据班课id查询班课详情
     * @param courseId
     * @return
     */
    Course getCourseById(int courseId);
}
