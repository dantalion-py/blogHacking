package com.app.OyM.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.OyM.model.UserModel;
import com.app.OyM.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserModel createNewUser(UserModel user){
        UserModel newUser = userRepository.save(user);
        return newUser;
    }
}
