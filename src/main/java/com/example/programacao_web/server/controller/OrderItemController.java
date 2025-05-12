package com.example.programacao_web.server.controller;

import com.example.programacao_web.server.dto.OrderItemDTO;
import com.example.programacao_web.server.models.OrderItem;
import com.example.programacao_web.server.repository.OrderItemRepository;
import com.example.programacao_web.server.service.OrderItemService;
import com.example.programacao_web.server.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderItens")
public class OrderItemController extends CrudController<Long, OrderItem, OrderItemDTO, OrderItemRepository, OrderItemService> {

    public OrderItemController() {
        super(OrderItem.class, OrderItemDTO.class);
    }
}