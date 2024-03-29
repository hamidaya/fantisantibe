package org.fantisanti.models;

import java.util.Date;

public class Festival extends Event {

    Long festivalID;
    String artistName;
    Boolean campingAvailable;
    Date festivalStartDate;
    Date festivalEndtDate;

    public Long getFestivalID() {
        return festivalID;
    }

    public void setFestivalID(Long festivalID) {
        this.festivalID = festivalID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Boolean getCampingAvailable() {
        return campingAvailable;
    }

    public void setCampingAvailable(Boolean campingAvailable) {
        this.campingAvailable = campingAvailable;
    }

    public Date getFestivalStartDate() {
        return festivalStartDate;
    }

    public void setFestivalStartDate(Date festivalStartDate) {
        this.festivalStartDate = festivalStartDate;
    }

    public Date getFestivalEndtDate() {
        return festivalEndtDate;
    }

    public void setFestivalEndtDate(Date festivalEndtDate) {
        this.festivalEndtDate = festivalEndtDate;
    }

    public Festival(Long festivalID, String festivalName, String festivalLocation, Date festivalDate, Double festivalPrice, Integer availableTickets) {
        super(festivalID, festivalName, festivalLocation, festivalDate, festivalPrice, availableTickets);

    }
}

