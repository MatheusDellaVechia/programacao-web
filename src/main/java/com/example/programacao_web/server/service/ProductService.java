package com.example.programacao_web.server.service;

import com.example.programacao_web.server.models.Product;
import com.example.programacao_web.server.repository.ProductRepository;
import com.example.programacao_web.server.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends CrudService<Long, Product, ProductRepository> {

    @Override
    public JpaSpecificationExecutor<Product> getSpecExecutor() {
        return repository;
    }
}