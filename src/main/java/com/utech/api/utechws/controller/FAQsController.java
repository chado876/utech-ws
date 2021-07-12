package com.utech.api.utechws.controller;

import com.utech.api.utechws.model.Module;
import com.utech.api.utechws.service.FAQsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FAQsController {

    @Autowired
    FAQsService faQsService;

    @GetMapping("/startDate")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> getUtechStartDate() {
        String startDate = faQsService.getUtechStartDate();
        return new ResponseEntity<>(startDate, HttpStatus.OK);
    }

    @GetMapping("/endDate")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> getUtechEndDate() {
        String endDate = faQsService.getUtechEndDate();
        return new ResponseEntity<>(endDate, HttpStatus.OK);
    }

    @GetMapping("/libraryTimes")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> getLibraryTimes() {
        String libraryTimes = faQsService.getLibraryOpenTimes();
        return new ResponseEntity<>(libraryTimes, HttpStatus.OK);
    }

    @GetMapping("/howToPay")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> howToPay() {
        String paymentOptions = faQsService.getPaymentOptions();
        return new ResponseEntity<>(paymentOptions, HttpStatus.OK);
    }

}
