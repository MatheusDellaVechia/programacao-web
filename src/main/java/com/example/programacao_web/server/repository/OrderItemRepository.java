package com.example.programacao_web.server.repository;

import com.example.programacao_web.server.models.OrderItem;
import com.example.programacao_web.server.shared.CrudRepository;
import com.example.programacao_web.server.spec.OrderItemSpecExecutor;

public interface OrderItemRepository extends CrudRepository<Long, OrderItem>, OrderItemSpecExecutor {
}
