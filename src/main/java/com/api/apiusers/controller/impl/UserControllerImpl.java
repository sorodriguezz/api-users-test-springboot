package com.api.apiusers.controller.impl;

import com.api.apiusers.controller.UserController;
import com.api.apiusers.dto.UserDto;
import com.api.apiusers.entity.UserEntity;
import com.api.apiusers.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<List<UserEntity>> getUsers() {
        return new ResponseEntity<>(this.userService.getUsers(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserEntity> saveUser(UserEntity user) {
        return new ResponseEntity<>(this.userService.saveUser(user), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserEntity> updateUser(String idUser, UserDto userDto) {

        UserEntity user = this.userService.updateUser(idUser, userDto);

        if(user == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserEntity> getUserById(String idUser) {

        UserEntity user = this.userService.findUserById(idUser);

        if(user == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public void deleteUser(String idUser) {
        this.userService.deleteUser(idUser);
    }
}
