package com.test.demo.payment.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.payment.services.InvoiceService;
import com.test.demo.payment.services.MediaPayment;

@RestController
public class PaymentController {

  private final MediaPayment mediaPayment;
  private final InvoiceService invoiceService;

  public PaymentController(
    @Qualifier("payCash") MediaPayment mediaPayment, 
    InvoiceService invoiceService) {
    this.mediaPayment = mediaPayment;
    this.invoiceService = invoiceService;
  }

  @GetMapping("/payment/process")
  public void processPayment() {
    mediaPayment.processPay();
  }

}
