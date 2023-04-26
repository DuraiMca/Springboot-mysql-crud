package com.example.durai.SpringBootSampleApi.service;

import com.example.durai.SpringBootSampleApi.entity.User;

import java.util.List;


public interface UserService {

    User registerUser(User user);
    User getUser(Long id);
    List<User> getAllUser();

    User updateUser(User user);
    void deleteUser(Long id);
}
