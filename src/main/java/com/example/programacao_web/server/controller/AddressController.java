package com.example.programacao_web.server.controller;

import com.example.programacao_web.server.dto.AddressDTO;
import com.example.programacao_web.server.models.Address;
import com.example.programacao_web.server.repository.AddressRepository;
import com.example.programacao_web.server.service.AddressService;
import com.example.programacao_web.server.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("addresses")
public class AddressController extends CrudController<Long, Address, AddressDTO, AddressRepository, AddressService> {

    public AddressController() {
        super(Address.class, AddressDTO.class);
    }

    @Override
    public AddressDTO toDto(Address entity) {
        if (entity != null && entity.getUser() != null) {
            entity.getUser().setPassword(null);
        }
        return super.toDto(entity);
    }
}

