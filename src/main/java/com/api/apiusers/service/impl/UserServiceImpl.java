package com.api.apiusers.service.impl;

import com.api.apiusers.entity.User;
import com.api.apiusers.repository.UserRepository;
import com.api.apiusers.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) this.userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }
}
