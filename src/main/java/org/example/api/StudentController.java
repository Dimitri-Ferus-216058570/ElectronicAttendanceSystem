package org.example.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.Student;
import org.example.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import org.example.repository.factory.RepositoryFactory;


import java.util.List;

@RestController
@RequestMapping("/students")
@Tag(name = "Students", description = "Student management endpoints")
public class StudentController {
    private final StudentRepository studentRepository = RepositoryFactory.getStudentRepository("MEMORY");

    @PostMapping
    @Operation(summary = "Save a new student")
    @ApiResponse(responseCode = "200", description = "Student saved successfully")
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find student by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Student found"),
            @ApiResponse(responseCode = "404", description = "Student not found")
    })
    public Student findById(@PathVariable int id) {
        return studentRepository.findById(id);
    }

    @GetMapping
    @Operation(summary = "Get all students")
    @ApiResponse(responseCode = "200", description = "List of students")
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
