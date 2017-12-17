package com.example.adressbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{
    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;
    private String lastname;

    public User(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString()
    {
        return String.format("id:%s, %s, %s", id, firstname, lastname);
    }

    public User() {}

    public Integer getId()
    {
        return id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setId(Integer id)
    {
        this.id = id;
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
