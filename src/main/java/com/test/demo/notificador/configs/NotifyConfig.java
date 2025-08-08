package com.test.demo.notificador.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "notificador")
public class NotifyConfig {
  private String email;
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  public String getRemitente() {
    return remitente;
  }
  public void setRemitente(String remitente) {
    this.remitente = remitente;
  }
  private String remitente;
  
  
}
