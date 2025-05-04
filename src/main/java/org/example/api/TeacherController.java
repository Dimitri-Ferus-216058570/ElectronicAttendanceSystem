package org.example.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.Teacher;
import org.example.repository.TeacherRepository;
import org.springframework.web.bind.annotation.*;
import org.example.repository.factory.RepositoryFactory;


import java.util.List;

@RestController
@RequestMapping("/teachers")
@Tag(name = "Teachers", description = "Teacher management endpoints")
public class TeacherController {
    private final TeacherRepository teacherRepository = RepositoryFactory.getTeacherRepository("MEMORY");

    @PostMapping
    @Operation(summary = "Save a new teacher")
    @ApiResponse(responseCode = "200", description = "Teacher saved successfully")
    public void save(@RequestBody Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find teacher by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Teacher found"),
            @ApiResponse(responseCode = "404", description = "Teacher not found")
    })
    public Teacher findById(@PathVariable int id) {
        return teacherRepository.findById(id);
    }

    @GetMapping
    @Operation(summary = "Get all teachers")
    @ApiResponse(responseCode = "200", description = "List of teachers")
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}
