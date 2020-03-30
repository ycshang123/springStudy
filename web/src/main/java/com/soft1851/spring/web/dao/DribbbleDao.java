package com.soft1851.spring.web.dao;/*@ClassName DribbbleDao
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.soft1851.spring.web.entity.Dribbble;

import java.util.List;

public interface DribbbleDao {
    List<Dribbble> sellectAll();
    int[] batchInsert(List<Dribbble> dribbbles);
}
