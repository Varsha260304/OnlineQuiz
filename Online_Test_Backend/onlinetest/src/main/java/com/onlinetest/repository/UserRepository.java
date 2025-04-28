package com.onlinetest.repository;

import com.onlinetest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(User user) {
        String sql = "INSERT INTO USER_MASTER (name, password, phone , mail, gender) VALUES (?, ?, ?, ? ,? )";
        return jdbcTemplate.update(sql, user.getName(), user.getPassword(), user.getPhone(), user.getMail(), user.getGender());
    }
    
    public User findByUsername(String username) {
        String sql = "SELECT * FROM USER_MASTER WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, userRowMapper);
    }
    
    private RowMapper<User> userRowMapper = (rs, rowNum) -> {
        User user = new User();
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        return user;
    };
    // Other CRUD methods can be added here
}