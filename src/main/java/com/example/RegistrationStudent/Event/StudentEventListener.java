package com.example.RegistrationStudent.Event;

import com.example.RegistrationStudent.Student;

public interface StudentEventListener {
    void handleStudentCreated(Student student);
    void handleStudentDeleted(Long studentId);
}
