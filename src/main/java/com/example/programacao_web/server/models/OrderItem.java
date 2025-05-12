package com.example.programacao_web.server.models;

import com.example.programacao_web.server.shared.Identifiable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_itens")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull(message = "O id do pedido não pode ser nulo")
    private Order order;

    @ManyToOne
    @NotNull(message = "O id do produto não pode ser nulo")
    private Product product;

    @NotNull(message = "A quantidade do produto não pode ser nula")
    @Min(value = 1, message = "A quantidade do produto não pode ser menor que 1")
    private Integer quantity;

    @NotNull(message = "O preço não pode ser nulo")
    private Double price;

    @NotNull(message = "O preço não pode ser nulo")
    private Double total;

}