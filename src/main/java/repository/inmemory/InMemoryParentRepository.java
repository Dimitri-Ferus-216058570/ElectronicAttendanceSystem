package repository.inmemory;

import org.example.Parent;
import org.example.Student;
import repository.ParentRepository;

public class InMemoryParentRepository extends InMemoryRepository<Parent, Integer> implements ParentRepository {

    @Override
    protected Integer getId(Parent entity) {
        return entity.getParentId();
    }
}
