package org.example.inmemorytest;

import org.example.Teacher;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import repository.inmemory.InMemoryTeacherRepository;

import java.util.List;

import static org.junit.Assert.*;

public class InMemoryTeacherRepositoryTest {


    private InMemoryTeacherRepository teacherRepository = new InMemoryTeacherRepository();

    //@BeforeEach
    //void setUp() {

        //teacherRepository = new InMemoryTeacherRepository();
   // }

    @Test
    public void testSaveAndFindTeacher() {
        Teacher teacher = new Teacher(1, "Mr James","j@gmail.com","pink",001,"purple street","Grade R");
        teacherRepository.save(teacher);

        Teacher found = teacherRepository.findById(1);
        assertNotNull(found);
        assertEquals("Mr James", found.getName());
    }

    @Test
    public void testFindAllTeacher() {

        teacherRepository.save(new Teacher(1, "Mr James","j@gmail.com","pink",001,"purple street","Grade R"));
        teacherRepository.save(new Teacher(2, "Mrs Green","g@gmail.com","school",002,"land street","Grade R"));

        List<Teacher> teachers = teacherRepository.findAll();
        assertEquals(2, teachers.size());
    }

    @Test
    public void testDeleteTeacher() {
        teacherRepository.save(new Teacher(1, "Mr James","j@gmail.com","pink",001,"purple street","Grade R"));
        teacherRepository.delete(1);

        Teacher teacher = teacherRepository.findById(1);
        assertNull(teacher);
    }
}
