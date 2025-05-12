package com.example.programacao_web.controller;

import com.example.programacao_web.server.dto.CategoryDTO;
import com.example.programacao_web.shared.CrudControllerTest;

class CategoryControllerTest extends CrudControllerTest<CategoryDTO> {

    @Override
    protected String getURL() {
        return "/categories";
    }

    @Override
    protected CategoryDTO createValidObject() {
        return new CategoryDTO(null, "teste");
    }

    @Override
    protected CategoryDTO createInvalidObject() {
        return new CategoryDTO(null, null);
    }

    @Override
    protected void onBeforeUpdate(CategoryDTO dto) {
        dto.setId(1L);
    }
}