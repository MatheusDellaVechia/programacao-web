package com.example.programacao_web.server.service;

import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.repository.UserRepository;
import com.example.programacao_web.server.shared.CrudService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudService<Long, User, UserRepository> implements UserDetailsService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService() {
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public User save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username);
    }
}