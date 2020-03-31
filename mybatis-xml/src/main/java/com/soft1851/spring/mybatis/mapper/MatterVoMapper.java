package com.soft1851.spring.mybatis.mapper;/*@ClassName MatterVoMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/31
 *@Version 1.0
 **/

import com.soft1851.spring.mybatis.Dto.MatterDto;
import com.soft1851.spring.mybatis.vo.MatterVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
public interface MatterVoMapper {

    List<MatterVo> selectLimitFromTeacherClassByDynamicSql(MatterDto  matterDto);
}
