package repository.inmemory;

import org.example.User;
import repository.UserRepository;

public class InMemoryUserRepository extends InMemoryRepository <User, Integer> implements UserRepository {

    @Override
    protected Integer getId(User entity) {
        return entity.getUserId();
    }
}
