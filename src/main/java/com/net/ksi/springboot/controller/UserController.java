package com.net.ksi.springboot.controller;

import com.net.ksi.springboot.model.User;
import com.net.ksi.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}
