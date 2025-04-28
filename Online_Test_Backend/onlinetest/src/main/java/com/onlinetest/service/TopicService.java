package com.onlinetest.service;

import com.onlinetest.model.Topic;
import com.onlinetest.repository.TopicRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
    @Autowired
    private TopicRepository topicRepository;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addTopic(Topic topic) {
    	topicRepository.save(topic);
    }
    
    public List<Topic> getTopicsByCategoryId(int catId) {
        String sql = "SELECT ID, TOPIC_NAME FROM TOPIC_M WHERE CAT_ID = ?";
        return jdbcTemplate.query(sql, new Object[]{catId}, (rs, rowNum) -> {
            Topic topic = new Topic();
            topic.setId(rs.getInt("ID"));
            topic.setTopic(rs.getString("TOPIC_NAME"));
            topic.setCatId(catId);
            return topic;
        });
    }

    // Other service methods can be added here
}