package com.greenfoxacademy.foxclub.repositories;

import com.greenfoxacademy.foxclub.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByUserName(String userName);
}
