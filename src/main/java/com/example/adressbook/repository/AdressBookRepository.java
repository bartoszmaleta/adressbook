package com.example.adressbook.repository;

import com.example.adressbook.domain.Adress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdressBookRepository extends CrudRepository<Adress, Integer>
{
//    public Adress findAdressByUser_Firstname(String firstname);

}
