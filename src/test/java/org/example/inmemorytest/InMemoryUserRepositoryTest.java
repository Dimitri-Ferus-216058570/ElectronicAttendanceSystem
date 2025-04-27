package org.example.inmemorytest;

import org.example.User;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import repository.inmemory.InMemoryUserRepository;

import java.util.List;

import static org.junit.Assert.*;

public class InMemoryUserRepositoryTest {

    private InMemoryUserRepository userRepository = new InMemoryUserRepository();

   // @BeforeEach
   // void setUp() {

        //userRepository = new InMemoryUserRepository();
   // }

    @Test
    public void testSaveAndFindUser() {
        User user = new User(1, "James","j@gmail.com","pink");
        userRepository.save(user);

        User found = userRepository.findById(1);
        assertNotNull(found);
        assertEquals("James", found.getName());
    }

    @Test
    public void testFindAllUsers() {
        userRepository.save(new User(1, "James","j@gmail.com","pink"));
        userRepository.save(new User(2, "Pat","p@gmail.com","junk"));

        List<User> users = userRepository.findAll();
        assertEquals(2, users.size());
    }

    @Test
    public void testDeleteUser() {
        userRepository.save(new User(1, "James","j@gmail.com","pink"));
        userRepository.delete(1);

        User user = userRepository.findById(1);
        assertNull(user);
    }
}
