package com.example.RegistrationStudent.Properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "inject-student-yml")
@Component
public class ReaderStudentYml {

    private List<StudentYml> studentYml = new ArrayList<>();

    @Getter
    @Setter
    public static class StudentYml {

        private String firstName;

        private String lastName;

        private String age;

    }
}