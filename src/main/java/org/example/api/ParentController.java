package org.example.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.Parent;
import org.springframework.web.bind.annotation.*;
import org.example.repository.ParentRepository;
import org.example.repository.factory.RepositoryFactory;

import java.util.List;
@RestController
@RequestMapping("/parents")
@Tag(name = "Parents", description = "Parent management endpoints")
public class ParentController {

    private final ParentRepository parentRepository = RepositoryFactory.getParentRepository("MEMORY");

    @PostMapping
    @Operation(summary = "Save a new parent")
    @ApiResponse(responseCode = "200", description = "Parent saved successfully")
    public void save(@RequestBody Parent parent) {
        parentRepository.save(parent);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find parent by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Parent found"),
            @ApiResponse(responseCode = "404", description = "Parent not found")
    })
    public Parent findById(@PathVariable int id) {
        return parentRepository.findById(id);
    }

    @GetMapping
    @Operation(summary = "Get all parents")
    @ApiResponse(responseCode = "200", description = "List of parents")
    public List<Parent> findAll() {
        return parentRepository.findAll();
    }
}
