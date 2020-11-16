package com.udea.repositories;


import com.udea.domain.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> users = new ArrayList<User>();

    public List<User> getUsers(){
        User user = new User();
        user.username = "jaider";
        user.password = "5555";

        users.add(user);
        return users;
    }

    public User createUser(String name, String password){
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);

        users.add(user);
        return user;
    }

    public void deleteUser(){

    }
}
