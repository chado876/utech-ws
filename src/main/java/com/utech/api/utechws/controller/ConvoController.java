package com.utech.api.utechws.controller;

import com.utech.api.utechws.dto.ChatDto;
import com.utech.api.utechws.dto.ConvoDto;
import com.utech.api.utechws.service.ChatService;
import com.utech.api.utechws.service.ConvoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ConvoController {
    @Autowired
    ConvoService convoService;

    @PostMapping("/newConvo")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> addConvo(@RequestBody ConvoDto convoDto) {
        convoService.addConvo(convoDto);
        System.out.println("ADDING CONVO");
        return new ResponseEntity<>("success",HttpStatus.OK);
    }

}
