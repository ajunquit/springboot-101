package com.test.demo.payment.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class PayCash implements MediaPayment {

  public PayCash() {
    System.out.println("Constructor: Creating instance PayCash.");
  }

  @Override
  public void processPay(){
    System.out.println("Processing payment with cash...");
  }
  
}
