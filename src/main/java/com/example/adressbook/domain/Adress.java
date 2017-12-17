package com.example.adressbook.domain;

import javax.persistence.*;

@Entity
public class Adress
{
    private String adress;

    @Id
    @GeneratedValue
    private Long id;



//    @OneToOne
//    private Person person;
//
//    public void setPerson(Person person)
//    {
//        this.person = person;
//    }
//
//    public Person getPerson()
//    {
//        return person;
//    }

    public Adress(){}

    public Adress(String adress)
    {
        this.adress = adress;
    }

    @Override
    public String toString()
    {
        return "-- Adress -- {" +
                "id = " + id +
                ", adress = " + adress.toString();
    }

//    public Person getPerson()
//    {
//        return "-- Adress --" +
//                "adress" + id +
//                ", movie=" + movie.toString() +
//                ", actor=" + actor.toString() +
//                '}';
//    }

    public String getAdress()
    {
        return adress;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

}
