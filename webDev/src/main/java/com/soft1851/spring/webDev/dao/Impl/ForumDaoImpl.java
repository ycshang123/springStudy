package com.soft1851.spring.webDev.dao.Impl;/*@ClassName ForumDaoImpl
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/


import com.soft1851.spring.webDev.dao.ForumDao;
import com.soft1851.spring.webDev.entity.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


@Repository
public class ForumDaoImpl implements ForumDao {
    //使用注解的版本
//    private JdbcTemplate jdbcTemplate;
    //使用xml的版本
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    public ForumDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//    public  void  setJdbcTemplate(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public int insert(Forum forum) {
        String sql ="INSERT INTO t_forum VALUES (NULL,?)";
        Object[] args = {forum.getForunName()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int[] batchInsert(List<Forum> forums) {
        final  List<Forum> forumList = forums;
        String sql ="INSERT INTO t_forum VALUES (NULL,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setString(1,forumList.get(i).getForunName());
            }

            @Override
            public int getBatchSize() {
                return forumList.size();
            }
        });
    }

    @Override
    public int delete(int forumId) {
        String sql ="DELETE FROM t_forum WHERE forum_id = ?";
        Object[] args ={forumId};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int update(Forum forum) {
        String sql = "UPDATE t_forum SET forun_name = ? WHERE forum_id = ? ";
        Object[] args = { forum.getForunName(), forum.getForumId() };
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public Forum get(int forumId) {
        String sql ="SELECT * FROM  t_forum WHERE  forum_id =?";
        Object[] args ={forumId};
        return jdbcTemplate.queryForObject(sql,args,new BeanPropertyRowMapper<>(Forum.class));
    }

    @Override
    public List<Forum> selectAll() {
        String sql ="SELECT * FROM t_forum";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Forum.class));
    }

}
