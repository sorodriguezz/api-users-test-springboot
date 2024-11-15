package com.api.apiusers.repository;

import com.api.apiusers.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> { }
