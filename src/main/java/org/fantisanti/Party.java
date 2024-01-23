package org.fantisanti;

import java.util.Date;

public class Party extends Event {

    String partyName;
    String partyLocation;
    Date partyStartDate;
    Date partyEndDate;
    double partyPrice;
    String djName;


    public Party(String partyName, String partyLocation, Date partyStartDate, Date partyEndDate, double partyPrice, String djName) {
        super(partyName, partyLocation, partyStartDate, partyEndDate, partyPrice,djName);
    }
}
