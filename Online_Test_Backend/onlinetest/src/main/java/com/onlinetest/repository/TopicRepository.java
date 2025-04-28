package com.onlinetest.repository;

import com.onlinetest.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TopicRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Topic topic) {
        String sql = "INSERT INTO TOPIC_M (cat_id,topic_name) VALUES (?, ? )";
        return jdbcTemplate.update(sql, topic.getCatId(), topic.getTopic());
    }

    // Other CRUD methods can be added here
}