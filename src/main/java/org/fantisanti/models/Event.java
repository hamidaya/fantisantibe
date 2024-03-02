package org.fantisanti.models;
import org.fantisanti.interfaces.IEevent;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "events")

public class Event implements IEevent {

    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    private Long eventID;
    private String eventName;
    private String eventLocation;
    private Date eventStartDate;
    private Double eventPrice;
    private Integer availableTickets;

    public
    Event(Long eventID, String eventName, String eventLocation, Date eventStartDate, Double eventPrice, Integer availableTickets)
    {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventStartDate = eventStartDate;
        this.eventPrice = eventPrice;
        this.availableTickets = availableTickets;
    }

    public Event() {

    }

    public Long getEventID () {
            return eventID;
        }
        public void setEventID (Long eventID){
            this.eventID = eventID;
        }
        public String getEventName () {
            return eventName;
        }
        public void setEventName (String eventName){
            this.eventName = eventName;
        }
        public String getEventLocation () {
            return eventLocation;
        }
        public void setEventLocation (String eventLocation){
            this.eventLocation = eventLocation;
        }
        public Date getEventDate () {
            return eventStartDate;
        }
        public void setEventDate (Date eventDate){
            this.eventStartDate = eventDate;
        }
        public Double getEventPrice () {
            return eventPrice;
        }
        public void setEventPrice (Double eventPrice){
            this.eventPrice = eventPrice;
        }
        public Integer getAvailableTickets () {
            return availableTickets;
        }
        public void setAvailableTickets (Integer availableTickets){
            this.availableTickets = availableTickets;
        }

        @Override
        public void myEvent () {
            System.out.println("Event processing interface executed...");

        }

    }

