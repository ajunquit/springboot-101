package com.test.demo.client.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.client.models.Client;
import com.test.demo.client.services.ClientService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/clients")
public class ClientController {
  private final ClientService _clientService;
  
  public ClientController(ClientService clientService) {
    _clientService = clientService;
  }

  @GetMapping("/greet/{name}")
  public String greetClient(@PathVariable String name){
    Client client = _clientService.createClient(name);
    return "Hello, " + client.getName() + "!";
  }

  @GetMapping
  public ResponseEntity<List<Client>> list() {
      return ResponseEntity.ok(_clientService.list());
  }

  @PostMapping
  public Client create(@Valid @RequestBody Client entity) {
      return _clientService.createClient(entity);
  }
  
  @GetMapping("/{id}")
  public Client getClientById(@PathVariable UUID id) {
      return _clientService.findClientById(id);
  }
  
  @GetMapping("/search")
  public List<Client> search(@RequestParam(defaultValue = "") String name) {
      return _clientService.findClientByName(name);
  }
  

}
