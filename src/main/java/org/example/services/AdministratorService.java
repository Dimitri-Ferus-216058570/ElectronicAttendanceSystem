package org.example.services;

import org.example.Administrator;
import org.example.repository.AdministratorRepository;

import java.util.List;

public class AdministratorService {

    private final AdministratorRepository administratorRepository;

    public AdministratorService(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    public void registerAdministrator(Administrator administrator) {
        administratorRepository.save(administrator);
    }

    public Administrator getAdministratorById(int id) {
        return administratorRepository.findById(id);
    }

    public List<Administrator> getAllAdministrators() {
        return administratorRepository.findAll();
    }

    public void deleteAdministrator(int id) {
        administratorRepository.delete(id);
    }
}
