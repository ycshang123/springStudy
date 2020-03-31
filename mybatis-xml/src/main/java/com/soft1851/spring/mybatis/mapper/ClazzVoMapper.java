package com.soft1851.spring.mybatis.mapper;/*@ClassName ClazzVoMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.vo.ClazzVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional(rollbackFor = Exception.class)
public interface ClazzVoMapper {
    /**获取指定班课中所有学生的信息
     *
     * @param clazzId
     * @return
     */
    List<ClazzVo> getClazzStudent(int clazzId);

    /**
     * 获取指定班课中所有学生信息
     */
    List<Map<String,Object>> getClazzStudentMap(int clazzId);
}
