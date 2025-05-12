package com.example.programacao_web.server.models;

import com.example.programacao_web.server.shared.Identifiable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "adresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Identifiable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O id do usuário não pode ser nulo")
    @ManyToOne
    private User user;

    @NotNull(message = "O nome da rua não pode ser nulo")
    private String street;

    @NotNull(message = "O número da rua não pode ser nulo")
    private String number;

    @NotNull(message = "A cidade não pode ser nula")
    private String city;

    @NotNull(message = "O estado não pode ser nulo")
    private String state;

    @NotNull(message = "O CEP não pode ser nulo")
    private String zipCode;

    private String complement;

    private String neighborhood;
}