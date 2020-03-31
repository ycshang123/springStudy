package com.soft1851.spring.mybatis.mapper;/*@ClassName StudentMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {
    /**
     * 新增student，并返回自增主键
     */
    void insert(Student student);
    /**
     * 根据studentId删除Student
     */
    void delete(int studentId);
    /**
     * 更新student
     */
    void update(Student student);
    /**
     * 批量插入
     */
    int batchInsert(@Param("students")List<Student> students);
    /**
     * 根据id查找学生
     */
    Student getStudentById(int studentId);
    /**
     * 批量删除
     */
    int batchDelete(@Param("idList") List<Integer> idList);
    /**
     * 批量修改
     */
    int batchUpdate(@Param("students") List<Student> students);
    /**
     * 单表（带两个制定条件）查询
     */
    List<Student> selectLimit();

    /**
     * 单表指定查询条件（结合动态SQL）
     */
    List<Student> selectLimitByDynamicSql(Student student);
    /**
     * 查询所有学生，按生日排列，多对一关联查询学生所在班级信息
     */
    List<Student> selectAll();

}
