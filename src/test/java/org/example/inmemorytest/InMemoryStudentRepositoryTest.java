package org.example.inmemorytest;

import org.example.Student;
import org.junit.Test;
import org.example.repository.inmemory.InMemoryStudentRepository;

import java.util.List;

import static org.junit.Assert.*;

public class InMemoryStudentRepositoryTest {

    private InMemoryStudentRepository studentRepository = new InMemoryStudentRepository();

   // @BeforeEach
    //void setUp() {

        //studentRepository = new InMemoryStudentRepository();
    //}

    @Test
    public void testSaveAndFindStudent() {
        Student student = new Student(1, "Jack","j@gmail.com","pink",001,"Grade R",112,110,"pink Street","08/09/2022");
        studentRepository.save(student);

        Student found = studentRepository.findById(1);
        assertNotNull(found);
        assertEquals("Jack", found.getName());
    }

    @Test
    public void testFindAllStudent() {
        studentRepository.save(new Student(1, "Jack","j@gmail.com","pink",001,"Grade R",112,110,"pink Street","08/09/2022"));
        studentRepository.save(new Student(2, "Mike","m@gmail.com","jbl",002,"Grade R",112,150,"green Street","10/02/2022"));

        List<Student> students = studentRepository.findAll();
        assertEquals(2, students.size());
    }

    @Test
    public void testDeleteStudent() {
        studentRepository.save(new Student(1, "Jack","j@gmail.com","pink",001,"Grade R",112,110,"pink Street","08/09/2022"));
        studentRepository.delete(1);

        Student student = studentRepository.findById(1);
        assertNull(student);
    }
}
