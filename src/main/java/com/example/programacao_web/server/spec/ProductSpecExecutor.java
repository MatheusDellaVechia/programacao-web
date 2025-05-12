package com.example.programacao_web.server.spec;

import com.example.programacao_web.server.models.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductSpecExecutor extends JpaSpecificationExecutor<Product> {
}
