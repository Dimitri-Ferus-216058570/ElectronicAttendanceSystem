package org.example.repository.inmemory;

import org.example.Teacher;
import org.example.repository.TeacherRepository;

public class InMemoryTeacherRepository extends InMemoryRepository<Teacher, Integer> implements TeacherRepository {

    @Override
    protected Integer getId(Teacher entity) {
        return entity.getTeacherId();
    }
}
