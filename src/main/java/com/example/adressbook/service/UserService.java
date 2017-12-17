package com.example.adressbook.service;

import com.example.adressbook.domain.Adress;
import com.example.adressbook.domain.Person;
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

    public List<Person> getAllUsers()
    {
        List<Person> results = new ArrayList<>();
        Iterator<Person> temp = (Iterator<Person>) userRepository.findAll();
        temp.forEachRemaining(person -> results.add(person));
        return results;
         // TODO do list
    }

    public void addUser(Person person)
    {
        userRepository.save(person);
    }


    public Person getUserByAdress(String adress){
        Person result = null;
        try {
            result = userRepository.findPersonByAdress(adress);
        } catch (Exception e){

            System.out.printf("error !");
        }
        return result;
    }


}
