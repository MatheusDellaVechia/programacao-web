package com.example.programacao_web.server.validators;

import com.example.programacao_web.server.dto.UserDTO;
import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

public class UserValidator implements ConstraintValidator<ValidUser, UserDTO> {

    private final UserRepository repository;

    public UserValidator(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isValid(UserDTO entity, ConstraintValidatorContext context) {
        return validateUniqueUsername(entity, context);
    }

    boolean validateUniqueUsername(UserDTO entity, ConstraintValidatorContext context) {
        User user = repository.findByUsername(entity.getUsername());
        boolean valid = user == null || Objects.equals(user.getId(), entity.getId());

        if (!valid) {
            handleMessage(context, "O nome de usuário informado já está em uso", "username");
        }

        return valid;
    }

    public void handleMessage(ConstraintValidatorContext context, String message, String node) {
        context.buildConstraintViolationWithTemplate(message)
                .addPropertyNode(node)
                .addConstraintViolation()
                .disableDefaultConstraintViolation();
    }
}