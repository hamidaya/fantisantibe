package com.fanti.fanti.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class WeatherController {

    @GetMapping("/api/weather/current")
    public String fanti() {
        return "Zonnig in Amsterdam";
    }

    // Nieuwe /api/greeting met een naam parameter
    @GetMapping("/api/weather/current/{city}")
    public String greetingWithName(@PathVariable String city) {
        return "Bewolkt in " + city;
    }

    // Nieuwe /api/greeting met een naam parameter
    @GetMapping("/api/weather/current/{coordinates}")
    public String weather(@RequestParam double lat, @RequestParam double lon) {
        return "Het regent in " + lat +" " + lon;
    }
}
