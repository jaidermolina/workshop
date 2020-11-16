package com.udea.services;

import com.udea.domain.User;
import com.udea.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public String returnMessage(){
        return "hola mundo spring";
    }

    public List getUsers(){
        UserRepository repository = new UserRepository();
        return repository.getUsers();
    }

    public User createUser(String name, String password){
        UserRepository repository = new UserRepository();
        return repository.createUser(name, password);
    }
}
