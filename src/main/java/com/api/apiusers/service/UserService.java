package com.api.apiusers.service;

import com.api.apiusers.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User saveUser(User user);
}
