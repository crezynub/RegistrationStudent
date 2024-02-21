package com.example.RegistrationStudent.Service;

import com.example.RegistrationStudent.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(String firstname, String lastname, int age) {
        Student student = new Student();
        student.setId((long) students.size() + 1);
        student.setFirstname(firstname);
        student.setLastname(lastname);
        student.setAge(age);
        students.add(student);
    }

    public void deleteStudent(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public void clearStudentsList() {
        students.clear();
    }

}
