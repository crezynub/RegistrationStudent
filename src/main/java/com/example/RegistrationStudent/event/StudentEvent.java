package com.example.RegistrationStudent.event;

import com.example.RegistrationStudent.model.Student;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StudentEvent extends ApplicationEvent {

    private final Student student;

    public StudentEvent(Object source, Student student) {
        super(source);
        this.student=student;
    }
}