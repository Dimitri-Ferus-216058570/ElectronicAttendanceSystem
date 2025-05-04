package org.example.services;

import org.example.Student;
import org.example.repository.StudentRepository;

import java.util.*;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(int id) {
        studentRepository.delete(id);
    }
}
