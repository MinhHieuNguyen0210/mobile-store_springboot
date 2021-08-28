package com.java.mobilestore.repository;

import com.java.mobilestore.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReposiotry extends CrudRepository<User, Integer> {
    User findByUsername(String username);

}
