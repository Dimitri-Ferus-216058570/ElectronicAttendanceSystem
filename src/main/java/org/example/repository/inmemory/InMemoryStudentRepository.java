package org.example.repository.inmemory;

import org.example.repository.StudentRepository;
//import repository.*;
import org.example.Student;

public class InMemoryStudentRepository extends InMemoryRepository <Student, Integer> implements StudentRepository {

    @Override
    protected Integer getId(Student entity) {
        return entity.getStudentId();
    }

}

