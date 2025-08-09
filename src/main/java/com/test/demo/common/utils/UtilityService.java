package com.test.demo.common.utils;

import org.springframework.stereotype.Component;

@Component
public class UtilityService {

  public String greeting(String name) {
    return "Hola, " + name + "!";
  }
  
}
