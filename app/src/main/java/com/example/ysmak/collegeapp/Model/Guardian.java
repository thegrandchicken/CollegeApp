package com.example.ysmak.collegeapp.Model;

/**
 * Created by csaper6 on 12/13/16.
 */
public class Guardian {
    private String firstName, lastName;
    private String occupation;
    private int age;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() { return age; }

    public void setAge() { this.age = age; }

    public Guardian(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Guardian(String firstName, String lastName, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
    }
}
