package com.example.durai.SpringBootSampleApi.service;


import com.example.durai.SpringBootSampleApi.entity.User;
import com.example.durai.SpringBootSampleApi.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements  UserService {

    UserRepository userRepository;
    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User userData=userRepository.findById(user.getId()).get();
        userData.setName(user.getName());
        userData.setEmail(user.getEmail());
        User updatedData=userRepository.save(userData);
        return updatedData;
    }

    @Override
    public void deleteUser(Long id) {
      userRepository.deleteById(id);
    }
}
