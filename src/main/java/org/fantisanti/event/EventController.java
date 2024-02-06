package org.fantisanti.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
//    @GetMapping("/{eventId}")
//    public ResponseEntity<Event> getEventById(@PathVariable Long eventId) {
//        Event event = eventService.getEventById(eventId);
//        return ResponseEntity.ok(event);
//    }
//    @PostMapping
//    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
//        Event createdEvent = eventService.createEvent(event);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdEvent);
//    }
//    @PutMapping("/{eventId}")
//    public ResponseEntity<Event> updateEvent(@PathVariable Long eventId, @RequestBody Event updatedEvent) {
//        Event updated = eventService.updateEvent(eventId, updatedEvent);
//        return ResponseEntity.ok(updated);
//    }
//    @DeleteMapping("/{eventId}")
//    public ResponseEntity<Void> deleteEvent(@PathVariable Long eventId) {
//        eventService.deleteEvent(eventId);
//        return ResponseEntity.noContent().build();
    }
