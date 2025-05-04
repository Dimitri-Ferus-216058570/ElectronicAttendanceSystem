package org.example.inmemorytest;

import org.example.Parent;
import org.junit.Test;
import org.example.repository.inmemory.InMemoryParentRepository;

import java.util.List;

import static org.junit.Assert.*;

public class InMemoryParentRepositoryTest {

    private InMemoryParentRepository parentRepository = new InMemoryParentRepository();

    //@BeforeEach
    //void setUp() {

        //parentRepository = new InMemoryParentRepository();
    //}

    @Test
    public void testSaveAndFindParent() {
        Parent parent = new Parent(1, "James","j@gmail.com","pink",001, "0217879905","purple street");
        parentRepository.save(parent);

        Parent found = parentRepository.findById(1);
        assertNotNull(found);
        assertEquals("James", found.getName());
    }

    @Test
    public void testFindAllParents() {
        parentRepository.save(new Parent(1, "James","j@gmail.com","pink",001, "0217879905","purple street"));
        parentRepository.save(new Parent(2, "Mark","m@gmail.com","gold",002, "0217878899","green street"));

        List<Parent> parents = parentRepository.findAll();
        assertEquals(2, parents.size());
    }

    @Test
    public void testDeleteParent() {
        parentRepository.save(new Parent(1, "James","j@gmail.com","pink",001, "0217879905","purple street"));
        parentRepository.delete(1);

        Parent parent = parentRepository.findById(1);
        assertNull(parent);
    }
}
