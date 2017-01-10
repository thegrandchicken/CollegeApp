package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Sibling extends Person {

    private int age;
    private String relationship;

    public Sibling() {
        age = 10;
        relationship = "vaguely related";
    }

    public Sibling (int age, String relationship) {
        this.age = age;
        this.relationship = relationship;
    }

    public Sibling (String firstName, String lastName, int age, String relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.relationship = relationship;
    }

}
