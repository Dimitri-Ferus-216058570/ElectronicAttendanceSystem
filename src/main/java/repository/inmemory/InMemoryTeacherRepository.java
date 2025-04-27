package repository.inmemory;

import org.example.Teacher;
import repository.TeacherRepository;

public class InMemoryTeacherRepository extends InMemoryRepository<Teacher, Integer> implements TeacherRepository {

    @Override
    protected Integer getId(Teacher entity) {
        return entity.getTeacherId();
    }
}
