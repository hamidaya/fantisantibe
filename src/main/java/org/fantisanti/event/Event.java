package org.fantisanti.event;
import org.fantisanti.interfaces.IEevent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table (name = "events")
public class Event implements IEevent {

    @GeneratedValue
    @Id
    private Long eventID;
    private String eventName;
    private String eventLocation;
    private Date eventDate;
    private Double eventPrice;
    private Integer availableTickets;

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
            return eventDate;
        }
        public void setEventDate (Date eventDate){
            this.eventDate = eventDate;
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

        // Assuming IEevent interface has a method named "test1"
        @Override
        public void test1 () {
            System.out.println("Event: test1");
        }
        // Constructor to initialize fields
    public
        Event(Long eventID, String eventName, String eventLocation, Date eventDate, Double eventPrice, Integer availableTickets)
        {
            this.eventID = eventID;
            this.eventName = eventName;
            this.eventLocation = eventLocation;
            this.eventDate = eventDate;
            this.eventPrice = eventPrice;
            this.availableTickets = availableTickets;
        }
    }

