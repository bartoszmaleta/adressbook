package com.example.adressbook;

import com.example.adressbook.domain.Adress;
import com.example.adressbook.domain.Person;
import com.example.adressbook.service.AdressBookService;
import com.example.adressbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdressbookApplication implements CommandLineRunner
{

	@Autowired
	private UserService userService;

	@Autowired
	private AdressBookService adressBookService;


	public static void main(String[] args) {
		SpringApplication.run(AdressbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Adress adress = new Adress("Krakow");
		adressBookService.addAdress(adress);

		Person person = new Person("Bartosz", "Kowalski");
		person.setAdress(adress);
		userService.addUser(person);

		Person personFound = userService.getUserByAdress("Krakow");

		if (personFound != null)
			System.out.println(personFound.toString());


	}
}
