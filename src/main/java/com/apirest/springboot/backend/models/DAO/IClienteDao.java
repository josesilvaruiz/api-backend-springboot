package com.apirest.springboot.backend.models.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.apirest.springboot.backend.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
