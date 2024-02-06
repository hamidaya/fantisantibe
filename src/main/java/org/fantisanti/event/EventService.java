package org.fantisanti.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }


//    public Event getEventById(Long eventId) {
//        return eventRepository.findAllById()
//    }
//        public Event createEvent (Event event){
//        }
//
//        public Event updateEvent (Long eventId, Event updatedEvent){
//        }
//
//        public void deleteEvent (Long eventId){
//        }
    }
