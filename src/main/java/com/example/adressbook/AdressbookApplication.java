package com.example.adressbook;

import com.example.adressbook.service.AdressBookService;
import com.example.adressbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdressbookApplication {

	@Autowired
	UserService userService;

	@Autowired
	AdressBookService adressBookService;


	public static void main(String[] args) {
		SpringApplication.run(AdressbookApplication.class, args);
	}

	// testasdasdasdkljlkm
}
