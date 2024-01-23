package com.fanti.fanti.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FantiController {

    @GetMapping("/api/greeting")
    public String fanti() {
        return "Hallo onbekende";
    }

    // Nieuwe /api/greeting met een naam parameter
    @GetMapping("/api/greeting/{name}")
    public String greetingWithName(@PathVariable String name) {
        return "Hallo, leuk je te zien " + name;
    }

}

