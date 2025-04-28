package com.onlinetest.controller;

import com.onlinetest.model.Topic;
import com.onlinetest.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping
    public void addTopic(@RequestBody Topic topic) {
    	topicService.addTopic(topic);
    }
    
    @GetMapping("/{categoryId}")
    public ResponseEntity<List<Topic>> getTopics(@PathVariable int categoryId) {
        List<Topic> topics = topicService.getTopicsByCategoryId(categoryId);
        return ResponseEntity.ok(topics);
    }
}

