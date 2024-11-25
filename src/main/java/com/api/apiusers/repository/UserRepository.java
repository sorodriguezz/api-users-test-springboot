package com.api.apiusers.repository;

import com.api.apiusers.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> { }
