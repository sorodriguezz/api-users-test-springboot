package com.api.apiusers.controller;

import com.api.apiusers.dto.UserDto;
import com.api.apiusers.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("users")
public interface UserController {
    @GetMapping
    ResponseEntity<List<UserEntity>> getUsers();

    @PostMapping
    ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity user);

    @PutMapping("{idUser}")
    ResponseEntity<UserEntity> updateUser(@PathVariable String idUser, @RequestBody UserDto user);

    @GetMapping("{idUser}")
    ResponseEntity<UserEntity> getUserById(@PathVariable String idUser);

    @DeleteMapping("{idUser}")
    void deleteUser(@PathVariable String idUser);
}
