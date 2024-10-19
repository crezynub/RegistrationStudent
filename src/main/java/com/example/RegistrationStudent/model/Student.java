package com.example.RegistrationStudent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String age;

    @Override
    public String toString() {
        return "Student " + "id= " + id + ", " + firstName + " " + lastName + ", " + age + " years old";
    }
}