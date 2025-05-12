package com.example.programacao_web.server.controller;

import com.example.programacao_web.server.dto.ProductDTO;
import com.example.programacao_web.server.models.Product;
import com.example.programacao_web.server.repository.ProductRepository;
import com.example.programacao_web.server.service.ProductService;
import com.example.programacao_web.server.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController extends CrudController<Long, Product, ProductDTO, ProductRepository, ProductService> {

    public ProductController() {
        super(Product.class, ProductDTO.class);
    }
}