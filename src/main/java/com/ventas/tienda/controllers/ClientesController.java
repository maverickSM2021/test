package com.ventas.tienda.controllers;

import com.ventas.tienda.entity.Cliente;
import com.ventas.tienda.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesServicesImpl;

//    @GetMapping
//    @RequestMapping(value = "consultarClientes", method = RequestMethod.GET)
//    public ResponseEntity<Cliente> consultarClientes(){
        //signo de interrogacion es para indicarle que es una respuesta dinamica
//        List<Cliente> clientesConsultados = this.clientesServicesImpl.consultarClientes();
//
//        return ResponseEntity.ok(clientesConsultados);

//    }
}
