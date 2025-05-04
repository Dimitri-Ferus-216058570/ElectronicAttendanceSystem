package org.example.services;

import org.example.Parent;
import org.example.repository.ParentRepository;

import java.util.List;

public class ParentService {

    private final ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    public void registerParent(Parent parent) {
        parentRepository.save(parent);
    }

    public Parent getParentById(int id) {
        return parentRepository.findById(id);
    }

    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    public void deleteParent(int id) {
        parentRepository.delete(id);
    }
}
