package com.isaac.pacientes.controller;

import com.isaac.pacientes.entity.ContactoEntity;
import com.isaac.pacientes.repository.ContactoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {

    private final ContactoRepository contactoRepository;

    @GetMapping
    public List<ContactoEntity> contactoEntityList(){
        return contactoRepository.findAll();
    }
}
