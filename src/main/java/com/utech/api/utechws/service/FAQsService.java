package com.utech.api.utechws.service;


import org.springframework.stereotype.Service;

@Service
public class FAQsService {

    public String getUtechStartDate(){
        return "August 23, 2021";
    }

    public String getUtechEndDate(){
        return "December 3, 2021";
    }

    public String getLibraryOpenTimes(){
        return "Mondays to Fridays from 9AM to 4PM";
    }

    public String getPaymentOptions(){
        return "https://www.utech.edu.jm/admissions/enrolment/payment-options";
    }
}
