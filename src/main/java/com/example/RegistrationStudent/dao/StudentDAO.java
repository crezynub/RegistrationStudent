package com.example.RegistrationStudent.dao;

import com.example.RegistrationStudent.event.StudentEvent;
import com.example.RegistrationStudent.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
@RequiredArgsConstructor
public class StudentDAO {

    private static int PEOPLE_COUNT;

    private final List<Student> people = new CopyOnWriteArrayList<>();

    private final ApplicationEventPublisher publisher;

    public List <Student> studentList() {
        return people;
    }

    public void save(Student student) {
        student.setId(++PEOPLE_COUNT);
        people.add(student);
        publisher.publishEvent(new StudentEvent(this,student));
    }

    public void delete(int id) {
        for(Student person : people){
            if (person.getId() == id) {
                publisher.publishEvent(new StudentEvent(this,person));
                people.remove(person);
            }
        }
    }

    public void deleteAll() {
        people.clear();
        System.out.println("List students deleted");
    }
}