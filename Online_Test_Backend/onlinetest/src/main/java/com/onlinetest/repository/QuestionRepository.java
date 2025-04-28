package com.onlinetest.repository;

import com.onlinetest.model.Question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Question question) {
        String sql = "INSERT INTO QUESTION_M(cat_id, topic_id, question , option1, option2, option3, option4, answer) VALUES (?, ?, ?, ? ,?, ?, ?, ?)";
        return jdbcTemplate.update(sql, question.getCategory(), question.getTopic(), question.getQuestion(), question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4(), question.getAnswer());
    }
    
    public List<Question> findRandomQuestionsByTopicId(int topicId) {
        String sql = "SELECT * FROM (SELECT id, question, option1, option2, option3, option4, answer FROM QUESTION_M WHERE topic_id = ? ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= 5";
        return jdbcTemplate.query(sql, new Object[]{topicId}, (rs, rowNum) -> {
            Question question = new Question();
            question.setId(rs.getInt("id"));
            question.setQuestion(rs.getString("question"));
            question.setOption1(rs.getString("option1"));
            question.setOption2(rs.getString("option2"));
            question.setOption3(rs.getString("option3"));
            question.setOption4(rs.getString("option4"));
            question.setAnswer(rs.getString("answer"));
            return question;
        });
    }
    // Other CRUD methods can be added here
}