package com.onlinetest.controller;

import com.onlinetest.model.Question;
import com.onlinetest.repository.QuestionRepository;
import com.onlinetest.service.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    
    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping
    public void addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }
    
    @GetMapping("/{topicId}")
    public List<Question> getRandomQuestionsByTopic(@PathVariable int topicId) {
        // Implement logic to fetch random questions for a given topic ID
        return questionService.getRandomQuestionsByTopicId(topicId);
    }
}