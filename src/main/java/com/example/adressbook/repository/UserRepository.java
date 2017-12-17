package com.example.adressbook.repository;

import com.example.adressbook.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>
{
        public User findUserByFirstname(String name);
}
