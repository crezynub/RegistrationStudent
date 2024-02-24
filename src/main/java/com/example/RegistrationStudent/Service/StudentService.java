package com.example.RegistrationStudent.Service;

import com.example.RegistrationStudent.Student;
import com.example.RegistrationStudent.Event.StudentEventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    private Map<Long, Student> students = new HashMap<>();
    private List<StudentEventListener> eventListeners = new ArrayList<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public void addStudent(Student student) {
        student.setId(System.currentTimeMillis());
        students.put(student.getId(), student);
        notifyEventListeners(student);
   }

    private void notifyEventListeners(Student student) {
        for (StudentEventListener eventListener : eventListeners) {
            if (student != null) {
                eventListener.handleStudentCreated(student);
            } else {
                eventListener.handleStudentDeleted(student.getId());
            }
        }
    }

    public void deleteStudent(Long id) {
        Student student = students.remove(id);
        notifyEventListeners(student);
    }

    public void clearStudentsList() {
        students.clear();
    }

}
