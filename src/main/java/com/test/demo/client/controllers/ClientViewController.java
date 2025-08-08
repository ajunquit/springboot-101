package com.test.demo.client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientViewController {

    @GetMapping("/clients/view-greet")
    public String form() {
        return "greet"; // muestra greet.html sin nombre
    }

    @PostMapping("/clients/view-greet")
    public String greetFromForm(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "greet";
    }
}
