package com.example.programacao_web.controller;


import com.example.programacao_web.server.dto.AddressDTO;
import com.example.programacao_web.server.dto.OrderDTO;
import com.example.programacao_web.server.dto.UserDTO;
import com.example.programacao_web.server.enums.OrderStatus;
import com.example.programacao_web.server.models.Address;
import com.example.programacao_web.server.models.User;
import com.example.programacao_web.server.service.AddressService;
import com.example.programacao_web.server.service.UserService;
import com.example.programacao_web.shared.CrudControllerTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderControllerTest extends CrudControllerTest<OrderDTO> {

    @Override
    protected String getURL() {
        return "/orders";
    }

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    private User user;
    private Address address;

    @BeforeAll
    void setUp() {
        user = new User();
        user.setUsername("Teste");
        user.setPassword("Teste123456!@#");
        userService.save(user);

        address = new Address();
        address.setUser(user);
        address.setCity("Teste");
        address.setNumber("Teste");
        address.setState("Teste");
        address.setStreet("Teste");
        address.setZipCode("Teste");
        addressService.save(address);
    }

    @Override
    protected OrderDTO createValidObject() {
        return OrderDTO.builder()
                .user(new UserDTO(user.getId()))
                .address(new AddressDTO(address.getId()))
                .items(List.of())
                .total(0.0)
                .status(OrderStatus.PENDING)
                .build();
    }

    @Override
    protected OrderDTO createInvalidObject() {
        return OrderDTO.builder()
                .user(null)
                .address(null)
                .items(List.of())
                .total(0.0)
                .status(null)
                .build();
    }

    @Override
    protected void onBeforeUpdate(OrderDTO dto) {
        dto.setId(1L);
    }
}