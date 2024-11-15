package com.api.apiusers.controller;

import com.api.apiusers.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserController {
    ResponseEntity<List<User>> getUsers();

    ResponseEntity<User> saveUser(User user);
}
