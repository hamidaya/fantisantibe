package org.fantisanti;

import java.util.Date;

public class Party extends Event {

    Long partyID;
    Date partyDate;
    String djName;
    String dressCode;


     public Long getPartyID() {
        return partyID;
    }

    public void setPartyID(Long partyID) {
        this.partyID = partyID;
    }

    public Date getPartyDate() {
        return partyDate;
    }

    public void setPartyDate(Date partyDate) {
        this.partyDate = partyDate;
    }

    public String getDjName() {
        return djName;
    }

    public void setDjName(String djName) {
        this.djName = djName;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public Party(Long EventID, String eventName, String eventLocation, Date eventDate, Double eventPrice, Integer availableTickets) {
        super(EventID, eventName, eventLocation, eventDate, eventPrice, availableTickets);
    }
}

