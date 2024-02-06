//package org.fantisanti.app;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class WeatherController {
//
//    @GetMapping("/api/weather/current/{stad}")
//    public String fanti(@PathVariable String stad) {
//        return "Zonnig in Amsterdam" + stad;
//    }
//
//
//    // Nieuwe /api/greeting met een naam parameter
//    @GetMapping("/api/weather/current/stad/{city}")
//    public String weatherCity (@PathVariable String city) {
//        return "Bewolkt in " + city;
//    }
//
//    @GetMapping("/api/weather/current/coordinates")
//    public String weather(@RequestParam double lat, @RequestParam double lon) {
//        return "Het regent in " + lat + " " + lon;
//
//    }
//}
//
//
//
//
