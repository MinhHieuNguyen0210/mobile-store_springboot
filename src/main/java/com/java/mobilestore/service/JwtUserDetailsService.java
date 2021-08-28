package com.java.mobilestore.service;


import com.java.mobilestore.repository.UserReposiotry;
import com.java.mobilestore.request.UserRequest;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserReposiotry userReposiotry;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.java.mobilestore.entity.User user = userReposiotry.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    public com.java.mobilestore.entity.User save(UserRequest userRequest) {
        com.java.mobilestore.entity.User newUser = new com.java.mobilestore.entity.User();
        newUser.setUsername(userRequest.getUsername());
        newUser.setPassword(bcryptEncoder.encode(userRequest.getPassword()));
        return userReposiotry.save(newUser);
    }
}
