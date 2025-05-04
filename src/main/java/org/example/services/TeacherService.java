package org.example.services;

import org.example.Teacher;
import org.example.repository.TeacherRepository;

import java.util.List;

public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void registerTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(int id) {
        return teacherRepository.findById(id);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public void deleteTeacher(int id) {
        teacherRepository.delete(id);
    }
}
