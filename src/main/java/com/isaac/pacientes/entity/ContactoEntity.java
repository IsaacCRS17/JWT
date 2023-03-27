package com.isaac.pacientes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
@Table(name = "persona")
public class ContactoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto", unique = true, nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 15)
    private String nombre;

    @JsonFormat(pattern = "YYYY-MM-dd")
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "celular", length = 9)
    private String celular;

    @Column(name = "email", length = 30)
    private String email;



}
