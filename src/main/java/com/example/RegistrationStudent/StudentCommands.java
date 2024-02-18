package com.example.RegistrationStudent;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class StudentCommands {
    private final StudentService studentService;

    public StudentCommands(StudentService studentService){
        this.studentService = studentService;
    }

    @ShellMethod("Display all students")
    public void displayStudents() {
        studentService.getAllStudents().forEach(System.out::println);
    }

    @ShellMethod("Add a new student")
    public void addStudent(String firstName, String lastName, int age) {
        studentService.addStudent(firstName, lastName, age);
    }

    @ShellMethod("Delete student by id")
    public void deleteStudent(Long id) {
        studentService.deleteStudent(id);
    }

    @ShellMethod("Clear the list of students")
    public void clearStudents() {
        studentService.clearStudentsList();
    }
}
