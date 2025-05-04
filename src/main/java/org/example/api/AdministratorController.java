package org.example.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.Administrator;
import org.example.repository.AdministratorRepository;
import org.springframework.web.bind.annotation.*;
import org.example.repository.factory.RepositoryFactory;


import java.util.List;
@RestController
@RequestMapping("/admins")
@Tag(name = "Administrators", description = "Administrator management endpoints")
public class AdministratorController {
    private final AdministratorRepository adminRepository = RepositoryFactory.getAdministratorRepository("MEMORY");

    @PostMapping
    @Operation(summary = "Save a new administrator")
    @ApiResponse(responseCode = "200", description = "Administrator saved successfully")
    public void save(@RequestBody Administrator admin) {
        adminRepository.save(admin);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find administrator by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Administrator found"),
            @ApiResponse(responseCode = "404", description = "Administrator not found")
    })
    public Administrator findById(@PathVariable int id) {
        return adminRepository.findById(id);
    }

    @GetMapping
    @Operation(summary = "Get all administrators")
    @ApiResponse(responseCode = "200", description = "List of administrators")
    public List<Administrator> findAll() {
        return adminRepository.findAll();
    }
}
