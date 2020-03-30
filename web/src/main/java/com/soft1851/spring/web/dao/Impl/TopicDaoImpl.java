package com.soft1851.spring.web.dao.Impl;/*@ClassName TopicDaoImpl
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/26
 *@Version 1.0
 **/

import com.soft1851.spring.web.dao.TopicDao;
import com.soft1851.spring.web.entity.Topic;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
@Repository
public class TopicDaoImpl implements TopicDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Topic> selectAll() {
        String sql =" SELECT * FROM t_topic";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Topic.class));
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        final List<Topic> topicList = topics;
        String sql = "INSERT INTO t_topic(id,topic_name,topic_icon,followers_count,msg_count,followed,description)"+
                "VALUES(?,?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                Topic topic = topicList.get(i);
                preparedStatement.setString(1,topic.getId());
                preparedStatement.setString(2,topic.getTopicName());
                preparedStatement.setString(3,topic.getTopicIcon());
                preparedStatement.setInt(4,topic.getFollwersCount());
                preparedStatement.setInt(5,topic.getMsgCount());
                preparedStatement.setBoolean(6,topic.getFollowed());
                preparedStatement.setString(7,topic.getDescription());
            }

            @Override
            public int getBatchSize() {
                return topicList.size();
            }
        });
    }

    @Override
    public int insert(Topic topic) {
        String sql = "INSERT INTO t_topic(id,topic_name,topic_icon,followers_count,msg_count,followed,description)"+
                "VALUES(?,?,?,?,?,?,?)";
        Object[] params = {
                topic.getId(),
                topic.getTopicName(),
                topic.getTopicIcon(),
                topic.getFollwersCount(),
                topic.getMsgCount(),
                topic.getFollowed(),
                topic.getDescription()
        };

        return jdbcTemplate.update(sql,params);
    }
}
