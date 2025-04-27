package repository.inmemory;

import org.example.Administrator;
import org.example.Student;
import repository.AdministratorRepository;

public class InMemoryAdministratorRepository extends InMemoryRepository<Administrator, Integer> implements AdministratorRepository {

    @Override
    protected Integer getId(Administrator entity) {
        return entity.getAdminId();
    }
}
