package com.test.demo.payment.services;

import org.springframework.stereotype.Component;

@Component
public class PayCard implements MediaPayment {

  public PayCard() {
    System.out.println("Creating instance PayCard.");
  }

  @Override
  public void processPay() {
    System.out.println("Processing payment with card...");
  }
  
}
