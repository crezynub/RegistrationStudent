package com.example.RegistrationStudent.Event;

import org.springframework.context.event.EventListener;

public class StudentEventListener {
    @EventListener
    public void handleStudentCreated(StudentCreatedEvent event) {
        System.out.println("Student created: " + event.getStudent());
    }

    @EventListener
    public void handleStudentDeleted(StudentDeletedEvent event) {
        System.out.println("Student deleted with id: " + event.getStudentId());
    }
}
