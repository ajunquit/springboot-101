package com.test.demo.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.client.models.Client;
import com.test.demo.client.services.ClientService;

@RestController
public class ClientController {
  private final ClientService _clientService;
  
  public ClientController(ClientService clientService) {
    _clientService = clientService;
  }

  @GetMapping("/clients/greet/{name}")
  public String greetClient(@PathVariable String name){
    Client client = _clientService.createClient(name);
    return "Hello, " + client.getName() + "!";
  }

  @GetMapping("/clients/{name}")
  public Client getClient(@PathVariable String name){
    return _clientService.createClient(name);
  }

}
