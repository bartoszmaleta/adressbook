package com.example.adressbook.service;


import com.example.adressbook.domain.Adress;
import com.example.adressbook.repository.AdressBookRepository;
import com.example.adressbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdressBookService
{

//    @Autowired


//    public List<AdressBook> get


        @Autowired
        private AdressBookRepository adressBookRepository;

        public List<Adress> getAllAdresses() {
            List<Adress> result = new ArrayList<>();
            Iterable<Adress> temp = adressBookRepository.findAll();
            temp.forEach(addres -> result.add(addres));
            return result;
        }

        public void addAdress(Adress addres) {
            adressBookRepository.save(addres);
        }

//        public Adress getAdressByFirstnameAndLastname(String firstname, String lastname) {
//            Adress result = null;
//
//            try {
//                UserRepository.findPersonByAdress(adress);
//            } catch (Exception ex) {
//                ex.getMessage();
//            }
//            return result;
//        }

//        public List<Adress> getAdressesByFistnameAndLastname(String firstname, String lastname) {
//
//            return adressBookRepository.findAdressByUser_FirstnameAndUser_Lastname(firstname, lastname);
//
//        } TODO repair


    }
