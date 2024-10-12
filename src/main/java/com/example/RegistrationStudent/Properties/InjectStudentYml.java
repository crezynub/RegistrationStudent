package com.example.RegistrationStudent.Properties;

import com.example.RegistrationStudent.Service.Student;
import com.example.RegistrationStudent.Service.StudentDAO;
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
        for (ReaderStudentYml.StudentYml studen : readerStudentYml.getStudentYml()) {
            studentDAO.save(new Student(1,studen.getLastName(),
                    studen.getFirstName(),studen.getAge()));
        }
    }
}