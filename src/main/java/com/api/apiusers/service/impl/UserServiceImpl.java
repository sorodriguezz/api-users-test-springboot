package com.api.apiusers.service.impl;

import com.api.apiusers.dto.UserDto;
import com.api.apiusers.entity.UserEntity;
import com.api.apiusers.repository.UserRepository;
import com.api.apiusers.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getUsers() {
        return (List<UserEntity>) this.userRepository.findAll();
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return this.userRepository.save(user);
    }

    @Override
    public UserEntity updateUser(String idUser, UserDto user) {

        Optional<UserEntity> userOptional = this.userRepository.findById(idUser);

        if (userOptional.isPresent()) {
            UserEntity userEntity = new UserEntity();
            userEntity.setIdUser(idUser);
            userEntity.setUsername(user.getEmail());
            userEntity.setEmail(user.getEmail());

            return this.userRepository.save(userEntity);
        }

        return null;

    }

    @Override
    public UserEntity findUserById(String idUser) {
        Optional<UserEntity> user = this.userRepository.findById(idUser);
        return user.orElse(null);
    }

    @Override
    public void deleteUser(String idUser) {
        Optional<UserEntity> userOptional = this.userRepository.findById(idUser);
        userOptional.ifPresent(this.userRepository::delete);
    }
}
