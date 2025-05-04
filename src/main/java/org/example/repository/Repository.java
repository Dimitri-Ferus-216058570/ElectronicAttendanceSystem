package org.example.repository;
import java.util.*;

public interface Repository<T, ID> {
 void save(T entity);
 T findById(ID id);
 List<T> findAll();
 void delete(ID id);

}