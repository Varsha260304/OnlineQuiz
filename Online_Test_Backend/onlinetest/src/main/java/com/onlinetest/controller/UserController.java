package com.onlinetest.controller;

import com.onlinetest.model.User;
import com.onlinetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8000")
    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}