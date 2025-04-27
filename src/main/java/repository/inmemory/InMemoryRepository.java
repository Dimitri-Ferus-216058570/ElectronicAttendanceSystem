package repository.inmemory;

import repository.*;

import java.util.HashMap;
import java.util.*;

abstract class InMemoryRepository <T, ID> implements Repository<T, ID> {
    protected Map<ID, T> storage = new HashMap<>();

    public void save(T entity) {
        storage.put(getId(entity), entity);
    }

    public T findById(ID id) {
        return storage.get(id);
    }

    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void delete(ID id) {
        storage.remove(id);
    }

    protected abstract ID getId(T entity);
}


