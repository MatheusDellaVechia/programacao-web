package com.example.programacao_web.validators;

import com.example.programacao_web.server.dto.UserDTO;
import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.repository.UserRepository;
import com.example.programacao_web.server.validators.UserValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserValidatorTest {

    @Mock
    private UserRepository repository;

    @Spy
    @InjectMocks
    private UserValidator userValidator;

    @Mock
    private ConstraintValidatorContext context;

    private UserDTO user;

    @BeforeEach
    void setUp() {
        user = mock(UserDTO.class);
        lenient().when(user.getId()).thenReturn(1L);
        lenient().when(user.getUsername()).thenReturn("testUser");
        lenient().doNothing().when(userValidator).handleMessage(any(), any(), any());
    }

    @Test
    @DisplayName("Should return true when user is valid")
    void testIsValid_withValidUser() {
        when(repository.findByUsername("testUser")).thenReturn(null);
        assertTrue(userValidator.isValid(user, context));
    }

    @Test
    @DisplayName("Should return false when username is not unique")
    void testIsValid_withNonUniqueUsername() {
        User existingUser = new User(2L, "testUser", "Teste123!@#");
        when(repository.findByUsername("testUser")).thenReturn(existingUser);
        assertFalse(userValidator.isValid(user, context));
    }

    @Test
    @DisplayName("Should return true when username is unique and user is being updated")
    void testIsValid_withUniqueUsernameUpdate() {
        User existingUser = new User(1L, "testUser", "Teste123!@#");
        when(repository.findByUsername("testUser")).thenReturn(existingUser);
        assertTrue(userValidator.isValid(user, context));
    }

}