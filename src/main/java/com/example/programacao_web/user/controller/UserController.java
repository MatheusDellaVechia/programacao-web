package com.example.programacao_web.user.controller;

import com.example.programacao_web.user.models.User;
import com.example.programacao_web.user.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void createUser(@RequestBody @Valid User user) {
        this.userRepository.save(user);
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}

