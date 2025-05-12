package com.example.programacao_web.server.dto;

import com.example.programacao_web.server.enums.OrderStatus;
import com.example.programacao_web.server.models.OrderItem;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Long id;

    private UserDTO user;

    private AddressDTO address;

    @NotNull
    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;

    @NotNull(message = "O total não pode ser nulo")
    private Double total;

    @NotNull(message = "O status não pode ser nulo")
    private OrderStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}