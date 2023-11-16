package com.app.OyM.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.app.OyM.model.UserModel;
import com.app.OyM.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/home")
    public ResponseEntity<Map<String, Object>> home() {
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("message", "home");
        responseData.put("status", 200);
        return ResponseEntity.ok().body(responseData);
    }
    
    @PostMapping("/createUser")
    public ResponseEntity<?> createUSer(@RequestBody UserModel user, UriComponentsBuilder uriComponentsBuilder){
        var newUser = userService.createNewUser(user);
        URI uri = uriComponentsBuilder.path("/user/createUser/{id}").buildAndExpand(newUser.getId()).toUri(); 
        return ResponseEntity.created(uri).body(newUser);
    }

}
