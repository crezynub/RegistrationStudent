package com.example.RegistrationStudent.Event;

import com.example.RegistrationStudent.Student;
import org.springframework.context.event.EventListener;

public class StudentEventListenerImpl implements StudentEventListener {
    @EventListener
    public void handleStudentCreated(Student student) {
        System.out.println("Student created: " + student);
    }

    @EventListener
    public void handleStudentDeleted(Long studentId) {
        System.out.println("Student deleted with id: " + studentId);
    }
}
