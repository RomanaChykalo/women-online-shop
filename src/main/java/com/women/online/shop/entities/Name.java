package com.women.online.shop.entities;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return middleName;
    }

    public String getSurname() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

}
