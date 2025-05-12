package com.example.programacao_web.server.controller;

import com.example.programacao_web.server.dto.UserDTO;
import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.repository.UserRepository;
import com.example.programacao_web.server.service.UserService;
import com.example.programacao_web.server.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends CrudController<Long, User, UserDTO, UserRepository, UserService> {

    public UserController() {
        super(User.class, UserDTO.class);
    }

    @Override
    public UserDTO toDto(User entity) {
        entity.setPassword(null);
        entity.setUsername(null);
        return super.toDto(entity);
    }
}

