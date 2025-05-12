package com.example.programacao_web.server.models;

import com.example.programacao_web.server.enums.OrderStatus;
import com.example.programacao_web.server.shared.Identifiable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Address address;

    @NotNull
    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;

    @NotNull(message = "O total não pode ser nulo")
    private Double total;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "O status não pode ser nulo")
    private OrderStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
