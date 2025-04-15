package com.example.programacao_web.user.repository;

import com.example.programacao_web.user.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
