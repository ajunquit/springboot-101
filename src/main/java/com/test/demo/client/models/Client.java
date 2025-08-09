package com.test.demo.client.models;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Client {
  private UUID id;

  @NotNull
  @Size(min = 2, max = 100)
  private String name; 
  public Client( String name, UUID id) {
    this.id = id;
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  
}
