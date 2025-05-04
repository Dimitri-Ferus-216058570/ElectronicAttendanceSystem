package org.example.servicestest;

import org.example.Student;
import org.junit.Test;
import org.example.repository.StudentRepository;
import org.example.services.StudentService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class StudentServiceTest {

    private StudentRepository studentRepository = mock(StudentRepository.class);
    private StudentService studentService =  new StudentService(studentRepository);


    @Test
    public void testSaveStudent() {
        Student student = new Student(1, "Jack","j@gmail.com","pink",001,"Grade R",112,110,"pink Street","08/09/2022");
        studentService.registerStudent(student);
        verify(studentRepository, times(1)).save(student);
    }

    @Test
    public void testGetStudentById() {
        Student student = new Student(1, "Jack","j@gmail.com","pink",001,"Grade R",112,110,"pink Street","08/09/2022");
        when(studentRepository.findById(1)).thenReturn(student);

        Student result = studentService.getStudentById(1);
        assertNotNull(result);
        assertEquals("Jack", result.getName());
    }

    @Test
    public void testGetAllStudents() {
        when(studentRepository.findAll()).thenReturn(Arrays.asList(
                new Student(1, "Jack","j@gmail.com","pink",001,"Grade R",112,110,"pink Street","08/09/2022"),
                new Student(2, "Mike","m@gmail.com","jbl",002,"Grade R",112,150,"green Street","10/02/2022")
        ));

        List<Student> students = studentService.getAllStudents();
        assertEquals(2, students.size());
    }

    @Test
    public void testDeleteStudent() {
        studentService.deleteStudent(1);
        verify(studentRepository, times(1)).delete(1);
    }
}
