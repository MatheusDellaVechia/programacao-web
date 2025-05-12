package com.example.programacao_web.server.repository;

import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.shared.CrudRepository;

public interface UserRepository extends CrudRepository<Long, User> {

    User findByUsername(String username);
}
