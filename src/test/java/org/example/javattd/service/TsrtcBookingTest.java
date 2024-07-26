package org.example.javattd.service;

import org.example.javattd.model.Home;
import org.example.javattd.model.SearchForBusticket;
import org.example.javattd.model.TsrtcBooking;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TsrtcBookingTest {

    @Test

    public void ticketBook(){
        TsrtcBooking tsrtcBooking = new TsrtcBooking();
        Home home=new Home();
        SearchForBusticket searchForBusticket=new SearchForBusticket();
        searchForBusticket.fromCityName="Hyderbad";
        searchForBusticket.toCityName="Vjd";
        searchForBusticket.fromDate=new Date(25-2-2025);
        searchForBusticket.toDate=new Date(26-3-2025);
        SearchForBusticket busDetail =new SearchForBusticket();
        busDetail.fromCityName="hyderbad";
        busDetail.toCityName="suryapet";
        busDetail.fromDate=new Date(26-2-2025);
        busDetail.toDate=new Date(7-3-2025);
        tsrtcBooking.home=home;
        home.searchForBusticket=searchForBusticket;
        home.searchForBusticket=busDetail;




    }

}