package com.example.RegistrationStudent;

import lombok.Data;

@Data
public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private int age;

    @Override
    public String toString() {
        return String.format("Student{id=%d, firstname='%s', lastname='%s', age=%d}", id, firstname, lastname, age);
    }
}