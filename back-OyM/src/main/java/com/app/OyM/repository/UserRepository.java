package com.app.OyM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.OyM.model.UserModel;

public interface UserRepository extends MongoRepository<UserModel,String>{
    
}
