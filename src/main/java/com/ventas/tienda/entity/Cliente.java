package com.ventas.tienda.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCliente")
    private int idCliente;
    @Column(name = "Nombres")
    private String nombre;
    @Column(name = "Apellidos")
            private String apellido;
    @Column(name = "Telefono")
            private int telefono;
    @Column(name = "Mesa")
            private String mesa;
    @Column(name = "Email")
            private String Email;


}
