package com.example.RegistrationStudent;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
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