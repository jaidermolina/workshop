package com.udea.controllers;

import com.udea.domain.User;
import com.udea.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    public UserService user;

    @GetMapping(value = "/get")
    public List getUsers(){
        return user.getUsers();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody String name, @RequestBody String password){
        return user.createUser(name,password);
    }

}
