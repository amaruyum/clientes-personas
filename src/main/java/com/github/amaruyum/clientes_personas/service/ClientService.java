package com.github.amaruyum.clientes_personas.service;

import java.util.List;
import java.util.Optional;

import com.github.amaruyum.clientes_personas.entity.Client;

public interface ClientService {

    List<Client> getAll();

    Optional<Client> getById(Long id);

    Client create(Client client);

    Client update(Long id, Client client);

    void delete(Long id);
    
}
