package com.example.programacao_web.server.dto;

import com.example.programacao_web.server.enums.Color;
import com.example.programacao_web.server.enums.Size;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;

    @NotNull(message = "O nome do produto não pode ser nulo")
    private String name;

    @Min(value = 0, message = "A quantidade do produto não pode ser negativa")
    @NotNull(message = "O preço do produto não pode ser nulo")
    private Double price;

    @NotNull(message = "A descrição do produto não pode ser nula")
    private String description;

    private String image;

    private List<CategoryDTO> categories;

    private Color color;

    private Size size;

    @Min(value = 0, message = "A avaliação do produto não pode ser negativa")
    @Max(value = 5, message = "A avaliação do produto não pode ser maior que 500")
    private Double rating;
}