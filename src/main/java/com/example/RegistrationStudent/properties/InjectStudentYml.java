package com.example.RegistrationStudent.properties;

import com.example.RegistrationStudent.model.Student;
import com.example.RegistrationStudent.dao.StudentDAO;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("app.inject.enabled")
public class InjectStudentYml {

    private final StudentDAO studentDAO;

    private final ReaderStudentYml readerStudentYml;

    public InjectStudentYml(StudentDAO studentDAO, ReaderStudentYml readerStudentYml) {
        this.studentDAO = studentDAO;
        this.readerStudentYml = readerStudentYml;
        inject();
    }

    public void inject(){
        for (ReaderStudentYml.StudentYml student : readerStudentYml.getStudentYml()) {
            studentDAO.save(new Student(1, student.getLastName(),
                    student.getFirstName(),student.getAge()));
        }
    }
}