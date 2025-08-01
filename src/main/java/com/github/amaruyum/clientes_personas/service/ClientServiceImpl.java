package com.github.amaruyum.clientes_personas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.github.amaruyum.clientes_personas.entity.Client;
import com.github.amaruyum.clientes_personas.repository.ClientRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    
    private final ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client create(Client client) {
        if(clientRepository.existsByIdentification(client.getIdentification())) {
            throw new IllegalArgumentException("Ya existe un cliente con esta identificacion.");
        }
        return clientRepository.save(client);
    } 

    @Override
    public Client update(Long id, Client client) {
        Client existingClient = clientRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cliente no encontrado"));

        existingClient.setName(client.getName());
        existingClient.setGender(client.getGender());
        existingClient.setAge(client.getAge());
        existingClient.setIdentification(client.getIdentification());
        existingClient.setAddress(client.getAddress());
        existingClient.setPhone(client.getPhone());
        existingClient.setPassword(client.getPassword());
        existingClient.setStatus(client.getStatus());

        return clientRepository.save(existingClient);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

}
