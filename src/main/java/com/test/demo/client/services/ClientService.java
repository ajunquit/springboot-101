package com.test.demo.client.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.test.demo.client.models.Client;

@Component
public class ClientService {
  public Client createClient(String name) {
    return new Client(name, UUID.randomUUID());
  }

  public Client createClient(Client entity) {
    return new Client(entity.getName(), UUID.randomUUID());
  }

  public Client findClientById(UUID id) {
    return new Client("Client Name", id);
  }

  public List<Client> list() {
    return List.of(new Client("Client 1", UUID.randomUUID()), new Client("Client 2", UUID.randomUUID()));
  }

  public List<Client> findClientByName(String nombre) {
    return List.of(new Client(nombre, UUID.randomUUID()));
  }
}
