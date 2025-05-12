package com.example.programacao_web.server.shared;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CrudRepository<ID extends Serializable, E extends Identifiable<ID>> extends JpaRepository<E, ID> {

}