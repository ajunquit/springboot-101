package com.test.demo.payment.services;

import org.springframework.stereotype.Component;

@Component
public class PayTransfer implements MediaPayment {

  @Override
  public void processPay() {
    System.out.println("Processing payment with transfer...");
  }

}
