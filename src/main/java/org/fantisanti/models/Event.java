package org.fantisanti.models;

import org.fantisanti.interfaces.IEevent;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")

public class Event implements IEevent {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long eventID;
    private String festival;
    private String party;
    private String eventName;
    private String eventLocation;
    private Date eventStartDate;
    private Double eventPrice;
    private Integer availableTickets;

    public Event(Long eventID, String festival, String party, String eventName, String eventLocation, Date eventStartDate, Double eventPrice, Integer availableTickets) {
        this.eventID = eventID;
        this.festival = festival;
        this.party = party;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventStartDate = eventStartDate;
        this.eventPrice = eventPrice;
        this.availableTickets = availableTickets;
    }


    public Long getEventID() {
        return eventID;
    }

    public String getFestival() {
        return festival;
    }

    public String getParty() {
        return party;
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
        return eventStartDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventStartDate = eventDate;
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


    public void setFestival(String festival) {
        this.festival = festival;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public Date getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public Event() {

    }
    @Override
    public void myEvent() {
        System.out.println("Event processing interface executed...");

    }
}

