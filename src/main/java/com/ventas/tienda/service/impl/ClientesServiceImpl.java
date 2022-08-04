package com.ventas.tienda.service.impl;

import com.ventas.tienda.repository.ClientesRepository;
import com.ventas.tienda.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public String consultarClientes() {

        return "hola mundo";

//
//        List<Cliente> clientesDataSource = StreamSupport.stream(
//                this.clientesRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//
//        return clientesDataSource;
    }
}
