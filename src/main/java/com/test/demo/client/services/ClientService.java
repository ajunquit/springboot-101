package com.test.demo.client.services;

import org.springframework.stereotype.Component;

import com.test.demo.client.models.Client;

@Component
public class ClientService {
  public Client createClient(String name) {
    return new Client(name);
  }
}
