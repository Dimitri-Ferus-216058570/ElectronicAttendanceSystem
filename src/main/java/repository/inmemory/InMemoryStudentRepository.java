package repository.inmemory;

import repository.*;
import org.example.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository extends InMemoryRepository <Student, Integer> implements StudentRepository {

    @Override
    protected Integer getId(Student entity) {
        return entity.getStudentId();
    }

}

