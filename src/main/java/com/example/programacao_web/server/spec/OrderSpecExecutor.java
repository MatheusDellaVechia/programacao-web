package com.example.programacao_web.server.spec;

import com.example.programacao_web.server.models.Order;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderSpecExecutor extends JpaSpecificationExecutor<Order> {
}