package com.example.adressbook.repository;

import com.example.adressbook.domain.Adress;
import com.example.adressbook.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer>
{
//        public User findUserByFirstname(String name);
//        public User findUserByAdress (String adress);
}
