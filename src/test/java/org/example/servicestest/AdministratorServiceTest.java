package org.example.servicestest;

import org.example.Administrator;
import org.junit.Test;
import org.example.repository.inmemory.InMemoryAdministratorRepository;
import org.example.services.AdministratorService;

import static org.junit.Assert.*;
import java.util.List;

public class AdministratorServiceTest {

    private AdministratorService adminService = new AdministratorService(new InMemoryAdministratorRepository());;

    @Test
    public void testSaveAndGetAdministrator() {
        Administrator admin = new Administrator(1, "James","j@gmail.com","pink",001,"purple street");
        adminService.registerAdministrator(admin);

        Administrator result = adminService.getAdministratorById(1);
        assertNotNull(result);
        assertEquals("James", result.getName());
    }

    @Test
    public void testGetAllAdministrators() {
        adminService.registerAdministrator(new Administrator(1, "James","j@gmail.com","pink",001,"purple street"));
        adminService.registerAdministrator(new Administrator(2, "Pat","p@gmail.com","junk",002,"green street"));

        List<Administrator> admins = adminService.getAllAdministrators();
        assertEquals(2, admins.size());
    }

    @Test
    public void testDeleteAdministrator() {
        adminService.registerAdministrator(new Administrator(1, "James","j@gmail.com","pink",001,"purple street"));
        adminService.deleteAdministrator(1);

        Administrator result = adminService.getAdministratorById(200);
        assertNull(result);
    }
}
