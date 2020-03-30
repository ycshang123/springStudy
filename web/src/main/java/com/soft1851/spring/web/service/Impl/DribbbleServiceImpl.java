package com.soft1851.spring.web.service.Impl;/*@ClassName DribbbleServiceImpl
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.soft1851.spring.web.dao.DribbbleDao;
import com.soft1851.spring.web.entity.Dribbble;
import com.soft1851.spring.web.service.DribbbleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DribbbleServiceImpl implements DribbbleService {
    @Resource
    private DribbbleDao dribbbleDao;
    @Override
    public List<Dribbble> queryAll() {
        return dribbbleDao.sellectAll();
    }

    @Override
    public int[] batchInsetr(List<Dribbble> dribbbles) {
        return dribbbleDao.batchInsert(dribbbles);
    }
}
