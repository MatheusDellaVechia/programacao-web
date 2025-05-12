package com.example.programacao_web.server.service;

import com.example.programacao_web.server.models.Address;
import com.example.programacao_web.server.repository.AddressRepository;
import com.example.programacao_web.server.shared.CrudService;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends CrudService<Long, Address, AddressRepository> {
}
