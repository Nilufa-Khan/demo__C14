package com.example.demoC14.controller;

import com.example.demoC14.domain.User;
import com.example.demoC14.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userdata/v1")
public class UserController {
    UserService userService;
    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }
@PostMapping("/postuser")
    public ResponseEntity<?> saveUser(@RequestBody  User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

}
