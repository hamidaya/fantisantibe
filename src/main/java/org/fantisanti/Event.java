package org.fantisanti;

import java.util.Date;

public class Event implements IEevent {
    String partyName;
    String location;
    Date datum;
    Double ticketPrice;
    int availableTickets;

    public Event(String partyName, String partyLocation, Date partyStartDate, Date partyEndDate, double partyPrice, String djName) {
    }

    public Event(String name, String location, Date date, int availableTickets) {
    }

    public void test1() {
        System.out.println("test test");
    }
}
