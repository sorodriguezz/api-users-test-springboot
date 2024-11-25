package com.api.apiusers.service;

import com.api.apiusers.dto.UserDto;
import com.api.apiusers.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getUsers();

    UserEntity saveUser(UserEntity user);

    UserEntity updateUser(String idUser, UserDto user);

    UserEntity findUserById(String idUser);

    void deleteUser(String idUser);
}
