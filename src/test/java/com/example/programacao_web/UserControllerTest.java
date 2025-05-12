package com.example.programacao_web;

import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.MethodName.class)
public class UserControllerTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    TestRestTemplate restTemplate;

    @BeforeEach
    public void setUp() {
        userRepository.deleteAll();
        restTemplate.getRestTemplate().getInterceptors().clear();
    }

    @Test
    public void postUser_whenUserIsValid_receiveOk() {
        var user = this.getUser();

    }

    @Test
    public void postUser_whenUserIsValid_saveUser() {
        this.getUser();
    }

    private  User getUser() {
        User user = new User();
        user.setPassword("test");
        return user;
    }
}
