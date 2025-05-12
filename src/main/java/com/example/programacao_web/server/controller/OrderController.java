package com.example.programacao_web.server.controller;

import com.example.programacao_web.server.dto.OrderDTO;
import com.example.programacao_web.server.models.Order;
import com.example.programacao_web.server.repository.OrderRepository;
import com.example.programacao_web.server.service.OrderService;
import com.example.programacao_web.server.shared.CrudController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("orders")
public class OrderController extends CrudController<Long, Order, OrderDTO, OrderRepository, OrderService> {

    public OrderController() {
        super(Order.class, OrderDTO.class);
    }

    @Override
    public OrderDTO toDto(Order entity) {
        entity.setUser(null);
        return super.toDto(entity);
    }

    @Override
    public Page<OrderDTO> toPageDTO(Page<Order> page, Pageable pageable) {
        page.forEach(order -> order.setUser(null));
        return super.toPageDTO(page, pageable);
    }
}