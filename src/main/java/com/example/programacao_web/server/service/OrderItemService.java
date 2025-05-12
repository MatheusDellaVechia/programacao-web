package com.example.programacao_web.server.service;

import com.example.programacao_web.server.models.OrderItem;
import com.example.programacao_web.server.repository.OrderItemRepository;
import com.example.programacao_web.server.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService extends CrudService<Long, OrderItem, OrderItemRepository> {

    @Override
    public JpaSpecificationExecutor<OrderItem> getSpecExecutor() {
        return repository;
    }
}