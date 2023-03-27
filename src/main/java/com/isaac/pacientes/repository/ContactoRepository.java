package com.isaac.pacientes.repository;

import com.isaac.pacientes.entity.ContactoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<ContactoEntity, Integer> {
}
