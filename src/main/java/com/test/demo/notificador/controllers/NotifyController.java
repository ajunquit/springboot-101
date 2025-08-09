package com.test.demo.notificador.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.common.utils.UtilityService;
import com.test.demo.notificador.services.NotifyService;

@RestController
public class NotifyController {
  private final NotifyService _notificadorService;
  private final UtilityService _utilityService;

  public NotifyController(
    NotifyService notificadorService,
    UtilityService utilityService) {
    _notificadorService = notificadorService;
    _utilityService = utilityService; 
  }

  @GetMapping("/notify")
  public String notifyUser() {
    _notificadorService.notificar();
    return "The notification has been sent!";
  }

  @GetMapping("/greet/{name}")
  public String greet(@PathVariable String name) {
    return _utilityService.greeting(name);
  }
  
}
