package com.example.programacao_web.server.repository;

import com.example.programacao_web.server.models.Order;
import com.example.programacao_web.server.shared.CrudRepository;
import com.example.programacao_web.server.spec.OrderSpecExecutor;

public interface OrderRepository extends CrudRepository<Long, Order>, OrderSpecExecutor {
}
