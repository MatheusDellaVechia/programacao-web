package com.example.programacao_web.server.service;

import com.example.programacao_web.server.models.Order;
import com.example.programacao_web.server.repository.OrderRepository;
import com.example.programacao_web.server.shared.CrudService;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends CrudService<Long, Order, OrderRepository> {

    private final OrderItemService orderItemService;

    public OrderService(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @Override
    public JpaSpecificationExecutor<Order> getSpecExecutor() {
        return repository;
    }

    @Override
    public Order save(Order entity) {
        Order finalEntity = repository.save(entity);

        if (entity.getItems() != null) {
            entity.getItems().forEach(item -> {
                item.setOrder(finalEntity);
                orderItemService.save(item);
            });
        }

        return entity;
    }
}