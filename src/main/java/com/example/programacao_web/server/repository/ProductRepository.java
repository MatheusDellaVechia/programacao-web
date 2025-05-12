package com.example.programacao_web.server.repository;

import com.example.programacao_web.server.models.Product;
import com.example.programacao_web.server.shared.CrudRepository;
import com.example.programacao_web.server.spec.ProductSpecExecutor;

public interface ProductRepository extends CrudRepository<Long, Product>, ProductSpecExecutor {
}
