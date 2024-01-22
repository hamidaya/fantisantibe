package org.fantisanti;

import java.util.Date;

public class Event implements IEevent {

    String name;
    String location;
    Date datum;
    Double ticketPrice;
    int availableTickets;

    public Event(String name, String location, Date date, Price ticketPrice, int availableTickets) {

    }


    public void test1() {
        System.out.println("test test");
    }
}
