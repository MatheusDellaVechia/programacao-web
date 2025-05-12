package com.example.programacao_web.server.repository;


import com.example.programacao_web.server.models.Category;
import com.example.programacao_web.server.shared.CrudRepository;
import com.example.programacao_web.server.spec.CategorySpecExecutor;

public interface CategoryRepository extends CrudRepository<Long, Category>, CategorySpecExecutor {
}