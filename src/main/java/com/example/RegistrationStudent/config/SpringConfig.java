package com.example.RegistrationStudent.config;

import com.example.RegistrationStudent.properties.InjectStudentYml;
import com.example.RegistrationStudent.properties.ReaderStudentYml;
import com.example.RegistrationStudent.dao.StudentDAO;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(InjectStudentYml.class)
public class SpringConfig {

    @Bean
    public InjectStudentYml injectStudentYml(ReaderStudentYml readerStudentYml,
                                                StudentDAO studentDAO ) {
        return new InjectStudentYml(studentDAO, readerStudentYml);
    }
}