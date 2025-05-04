package org.example.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.User;
import org.springframework.web.bind.annotation.*;
import org.example.repository.UserRepository;
import org.example.repository.factory.RepositoryFactory;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "Users", description = "User management endpoints")
public class UserController {

    private final UserRepository userRepository = RepositoryFactory.getUserRepository("MEMORY");

    @PostMapping
    @Operation(summary = "Save a new user")
    @ApiResponse(responseCode = "200", description = "User saved successfully")
    public void save(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find user by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "User found"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public User findById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @GetMapping
    @Operation(summary = "Get all users")
    @ApiResponse(responseCode = "200", description = "List of users")
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
