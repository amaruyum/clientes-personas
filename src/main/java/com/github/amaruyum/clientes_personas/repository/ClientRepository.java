package com.github.amaruyum.clientes_personas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.amaruyum.clientes_personas.entity.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    boolean existsByIdentification(String identification);    
}
