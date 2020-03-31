package com.soft1851.spring.mybatis.mapper;/*@ClassName ClazzMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Clazz;

public interface ClazzMapper {
    /**
     * 根据clazzId一对一关联查询其管理的班级信息
     */
    Clazz getClazzOneToOne(int clazzId);
    /**
     * 根据clazzId一对多关联查询本班所有学生
     */
    Clazz getClazzOneToMany(int clazzId);
}
