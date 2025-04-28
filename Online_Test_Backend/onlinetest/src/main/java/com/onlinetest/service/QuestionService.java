package com.onlinetest.service;

import com.onlinetest.model.Question;
import com.onlinetest.repository.QuestionRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void addQuestion(Question question) {
    	questionRepository.save(question);
    }
    
    public List<Question> getRandomQuestionsByTopicId(int topicId) {
        return questionRepository.findRandomQuestionsByTopicId(topicId);
    }

    // Other service methods can be added here
}