package com.test.demo.payment.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

public InvoiceService(@Qualifier("payCash") MediaPayment mediaPayment) {
}
  
}
