package com.test.demo.notificador.services;

import org.springframework.stereotype.Service;

@Service
public class NotifyService {
  private final EmailService emailService;

  public NotifyService(EmailService emailService){
    this.emailService = emailService;
  }

  public void notificar(){
    this.emailService.enviar();
  }  
}
