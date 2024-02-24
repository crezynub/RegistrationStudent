package com.example.RegistrationStudent.App;

import com.example.RegistrationStudent.Service.StudentService;
import com.example.RegistrationStudent.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class RegistrationStudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RegistrationStudentApplication.class, args);

		// Создание студентов при старте приложения (опционально)
		StudentService studentService = context.getBean(StudentService.class);
		if (studentService.getAllStudents().isEmpty()) {
			Student student1 = new Student();
			student1.setFirstname("Иван");
			student1.setLastname("Иванов");
			student1.setAge(20);

			Student student2 = new Student();
			student2.setFirstname("Петр");
			student2.setLastname("Петров");
			student2.setAge(21);

			studentService.addStudent(student1);
			studentService.addStudent(student2);
		}
	}
}
