package com.soft1851.spring.web.dao.Impl;/*@ClassName DribbbleDaoImol
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.soft1851.spring.web.dao.DribbbleDao;
import com.soft1851.spring.web.entity.Dribbble;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
@Repository
@Transactional(rollbackFor = Exception.class)
public class DribbbleDaoImpl implements DribbbleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Dribbble> sellectAll() {
        String sql = "SELECT * FROM t_dribble";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Dribbble.class));
    }

    @Override
    public int[] batchInsert(List<Dribbble> dribbbles) {
        final  List<Dribbble> dribbbleList = dribbbles;
        String sql = "INSERT INTO t_dribble(cover,title,avatar,nickname,fav,cmnt) VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                Dribbble dribbble = dribbbleList.get(i);
                preparedStatement.setString(1,dribbble.getCover());
                preparedStatement.setString(2,dribbble.getTitle());
                preparedStatement.setString(3,dribbble.getAvatar());
                preparedStatement.setString(4,dribbble.getNickname());
                preparedStatement.setInt(5,dribbble.getFav());
                preparedStatement.setInt(6,dribbble.getCmnt());
            }

            @Override
            public int getBatchSize() {
                return dribbbleList.size();
            }
        });
    }
}
