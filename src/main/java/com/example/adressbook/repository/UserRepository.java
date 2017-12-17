package com.example.adressbook.repository;

import com.example.adressbook.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Person, Integer>
{
          public Person findPersonByAdress(String adress);
}
