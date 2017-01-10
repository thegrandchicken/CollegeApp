package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public abstract class Person {
    protected String firstName;
    protected String lastName;

    public Person() {
        firstName = "Roger";
        lastName = "Rabbit";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
