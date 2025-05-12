package com.example.programacao_web.server.service;

import com.example.programacao_web.server.models.Category;
import com.example.programacao_web.server.repository.CategoryRepository;
import com.example.programacao_web.server.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends CrudService<Long, Category, CategoryRepository> {

    @Override
    public JpaSpecificationExecutor<Category> getSpecExecutor() {
        return repository;
    }
}
