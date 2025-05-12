package com.example.programacao_web.server.controller;

import com.example.programacao_web.server.dto.CategoryDTO;
import com.example.programacao_web.server.models.Category;
import com.example.programacao_web.server.repository.CategoryRepository;
import com.example.programacao_web.server.service.CategoryService;
import com.example.programacao_web.server.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController extends CrudController<Long, Category, CategoryDTO, CategoryRepository, CategoryService> {

    public CategoryController() {
        super(Category.class, CategoryDTO.class);
    }

}