package org.fantisanti.app;

import org.fantisanti.interfaces.IEevent;

import java.util.Date;

public class Event implements IEevent {
    @Override
    public void test1() {
        System.out.println("eventje");
    }
    Long eventID;
    String eventName;
    String eventLocation;
    Date EventDate;
    Double eventPrice;
    Integer availableTickets;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEventDate() {
        return EventDate;
    }

    public void setEventDate(Date eventDate) {
        EventDate = eventDate;
    }

    public Double getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(Double eventPrice) {
        this.eventPrice = eventPrice;
    }

    public Integer getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(Integer availableTickets) {
        this.availableTickets = availableTickets;
    }

    public Event(Long EventID, String eventName, String eventLocation, Date eventDate, Double eventPrice, Integer availableTickets) {

    }

}
