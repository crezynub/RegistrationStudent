package com.example.RegistrationStudent.Service;

import com.example.RegistrationStudent.Service.StudentService;
import com.example.RegistrationStudent.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class StudentCommands {
    private final StudentService studentService;
@Autowired
    public StudentCommands(StudentService studentService){
        this.studentService = studentService;
    }

    @ShellMethod("Display all students")
    public void displayStudents() {
        studentService.getAllStudents().forEach(System.out::println);
    }

    @ShellMethod("Add a new student")
    public void addStudent(
            @ShellOption String firstname,
            @ShellOption String lastname,
            @ShellOption int age) {
        Student student = new Student();
        student.setFirstname(firstname);
        student.setLastname(lastname);
        student.setAge(age);
        studentService.addStudent(student.getFirstname(), student.getLastname(), student.getAge());
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
