package com.example.adressbook.service;

import com.example.adressbook.domain.User;
import com.example.adressbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

//    public List<User> getAllUsers()
////    {
////        List<User> results = new ArrayList<>();
//////        Iterator<User> temp = userRepository.findAll();
//////        temp.forEach(user -> results.add(user));
//////        return results;
////        // TODO do list
////    }

    public void addUser(User user)
    {
        userRepository.save(user);
    }


//    public User getUserByFirstname(String name){
//        User result = null;
//        try {
//            result = userRepository.findUserByFirstname(name);
//        } catch (Exception e){
//
//            System.out.printf("error !");
//        }
//        return result;
//    }
}
