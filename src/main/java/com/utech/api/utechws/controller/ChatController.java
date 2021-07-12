package com.utech.api.utechws.controller;

import com.utech.api.utechws.dto.ChatDto;
import com.utech.api.utechws.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {
    @Autowired
    ChatService chatService;

    @PostMapping("/newChat")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> addChat(@RequestBody ChatDto chatDto) {
        chatService.addChat(chatDto);
        System.out.println("ADDING");
        return new ResponseEntity<>("success",HttpStatus.OK);
    }

}
