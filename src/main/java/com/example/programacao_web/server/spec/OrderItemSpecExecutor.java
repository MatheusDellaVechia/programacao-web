package com.example.programacao_web.server.spec;

import com.example.programacao_web.server.models.OrderItem;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemSpecExecutor extends JpaSpecificationExecutor<OrderItem> {
}