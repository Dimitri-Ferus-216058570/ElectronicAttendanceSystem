package org.example.repository.inmemory;

import org.example.Administrator;
import org.example.repository.AdministratorRepository;

public class InMemoryAdministratorRepository extends InMemoryRepository<Administrator, Integer> implements AdministratorRepository {

    @Override
    protected Integer getId(Administrator entity) {
        return entity.getAdminId();
    }
}
