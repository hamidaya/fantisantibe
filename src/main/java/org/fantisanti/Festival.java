package org.fantisanti;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Festival extends Event {

    private List<Artist> Artists;
    private Boolean campingAvailable;

    public List<Artist> getArtists() {
        return Artists;
    }

    public void setArtists(List<Artist> artists) {
        Artists = artists;
    }

    public Boolean getcampingAvailable() {
        return campingAvailable;
    }

    public void setcampingAvailable(Boolean campingAvailable) {
        campingAvailable = campingAvailable;
    }

    public Festival(String name, String location, Date date, int availableTickets) {
        super(name,location, date, availableTickets);
        this.Artists = new ArrayList<>();
        this.campingAvailable = false;
    }
}

