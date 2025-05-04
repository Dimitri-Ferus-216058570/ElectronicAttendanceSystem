package org.example.servicestest;

import org.example.Teacher;
import org.junit.Test;
import org.example.repository.inmemory.InMemoryTeacherRepository;
import org.example.services.TeacherService;

import static org.junit.Assert.*;
import java.util.List;

public class TeacherServiceTest {

    private TeacherService teacherService = new TeacherService(new InMemoryTeacherRepository());;


    @Test
    public void testAddAndGetTeacher() {
        Teacher teacher = new Teacher(1, "Mr James","j@gmail.com","pink",001,"purple street","Grade R");
        teacherService.registerTeacher(teacher);

        Teacher result = teacherService.getTeacherById(1);
        assertNotNull(result);
        assertEquals("Mr James", result.getName());
    }

    @Test
    public void testGetAllTeachers() {
        teacherService.registerTeacher(new Teacher(1, "Mr James","j@gmail.com","pink",001,"purple street","Grade R"));
        teacherService.registerTeacher(new Teacher(2, "Mrs Green","g@gmail.com","school",002,"land street","Grade R"));

        List<Teacher> teachers = teacherService.getAllTeachers();
        assertEquals(2, teachers.size());
    }

    @Test
    public void testDeleteTeacher() {
        teacherService.registerTeacher(new Teacher(1, "Mr James","j@gmail.com","pink",001,"purple street","Grade R"));
        teacherService.deleteTeacher(1);

        Teacher result = teacherService.getTeacherById(1);
        assertNull(result);
    }
}

