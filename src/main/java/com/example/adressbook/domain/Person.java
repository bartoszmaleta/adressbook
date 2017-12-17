package com.example.adressbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person
{
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;
    private String lastname;

    @OneToOne
    private Adress adress;

    public void setAdress(Adress adress)
    {
        this.adress = adress;
    }

    public Person(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
//    public String toString()
//    {
//        return String.format("id:%s, %s, %s", id, firstname, lastname);
//    }

    public String toString() {
        return "-- Person -- " +
                "id = " + id +
                ", firstname = " + firstname + '\'' +
                ", lastName = '" + lastname + '\'' +
                ", addressOfUser='" + adress + '\'' +
                '}';
    }

    public Person() {}


    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }


    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
}
