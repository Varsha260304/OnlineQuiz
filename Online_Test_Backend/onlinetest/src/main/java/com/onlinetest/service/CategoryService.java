package com.onlinetest.service;

import com.onlinetest.model.Category;
import com.onlinetest.repository.CategoryRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addCategory(Category category) {
    	categoryRepository.save(category);
    }
    
    public List<Category> getAllCategories() {
        String sql = "SELECT id, name FROM CATEGORY_M";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Category category = new Category();
            category.setId(rs.getInt("id"));
            category.setName(rs.getString("name"));
            return category;
        });
    }

    // Other service methods can be added here
}

