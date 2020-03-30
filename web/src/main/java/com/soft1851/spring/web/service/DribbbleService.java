package com.soft1851.spring.web.service;/*@ClassName DribbbleService
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.soft1851.spring.web.entity.Dribbble;

import java.util.List;

public interface DribbbleService {
    List<Dribbble> queryAll();
    int[] batchInsetr(List<Dribbble> dribbbles);
}
