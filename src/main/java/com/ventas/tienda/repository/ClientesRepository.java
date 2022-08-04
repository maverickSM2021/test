package com.ventas.tienda.repository;

import com.ventas.tienda.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClientesRepository extends CrudRepository<Cliente, Integer> {

}
