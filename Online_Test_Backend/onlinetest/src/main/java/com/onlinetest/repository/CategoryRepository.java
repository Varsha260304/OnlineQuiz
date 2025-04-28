package com.onlinetest.repository;

import com.onlinetest.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Category category) {
        String sql = "INSERT INTO CATEGORY_M (name, description, code) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, category.getName(), category.getDescription(), category.getCode());
    }

    // Other CRUD methods can be added here
}