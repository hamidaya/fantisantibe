package org.fantisanti.eventRegistration;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventRegistrationController {
    @GetMapping("/event/{eventName}")
        public String getEventName (@PathVariable String eventName){
            return eventName;
        }
}






