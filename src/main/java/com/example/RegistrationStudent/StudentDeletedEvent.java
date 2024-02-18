package com.example.RegistrationStudent;

import org.springframework.context.ApplicationEvent;

public class StudentDeletedEvent extends ApplicationEvent {
    private final Long studentId;

    public StudentDeletedEvent(Object source, Long studentId) {
        super(source);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }
}