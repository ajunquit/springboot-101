package com.test.demo.notificador.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.test.demo.notificador.configs.NotifyConfig;

@Service
public class EmailService {
  private String email;
  private NotifyConfig config;

  // public EmailService(@Value("${notificador.email}") String email) {
  //   this.email = email;
  // }

  public EmailService(NotifyConfig config) {
    this.config = config;
  }
  
  public void enviar() {
    System.out.println("De: " + config.getRemitente());
    System.out.println("Para: " + config.getEmail());
  }
}
