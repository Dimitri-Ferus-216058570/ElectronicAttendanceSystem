package org.example.inmemorytest;

import org.example.Administrator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import repository.inmemory.InMemoryAdministratorRepository;

import java.util.List;

import static org.junit.Assert.*;

public class InMemoryAdministratorRepositoryTest {

    private InMemoryAdministratorRepository administratorRepository = new InMemoryAdministratorRepository();

   // @BeforeEach
   // void setUp() {

        //administratorRepository = new InMemoryAdministratorRepository();
    //}

    @Test
    public void testSaveAndFindAdministrator() {
        Administrator admin = new Administrator(1, "James","j@gmail.com","pink",001,"purple street");
        administratorRepository.save(admin);

        Administrator found = administratorRepository.findById(1);
        assertNotNull(found);
        assertEquals("James", found.getName());
    }

    @Test
    public void testFindAllAdministrators() {
        administratorRepository.save(new Administrator(1, "James","j@gmail.com","pink",001,"purple street"));
        administratorRepository.save(new Administrator(2, "Pat","p@gmail.com","junk",002,"green street"));

        List<Administrator> admins = administratorRepository.findAll();
        assertEquals(2, admins.size());
    }

    @Test
    public void testDeleteAdministrator() {
        administratorRepository.save(new Administrator(1, "James","j@gmail.com","pink",001,"purple street"));
        administratorRepository.delete(1);

        Administrator admin = administratorRepository.findById(1);
        assertNull(admin);
    }
}
