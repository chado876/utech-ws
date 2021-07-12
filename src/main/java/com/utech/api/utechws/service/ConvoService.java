package com.utech.api.utechws.service;

import com.utech.api.utechws.dto.ChatDto;
import com.utech.api.utechws.dto.ConvoDto;
import com.utech.api.utechws.model.Chat;
import com.utech.api.utechws.model.Convo;
import com.utech.api.utechws.repository.ChatRepo;
import com.utech.api.utechws.repository.ConvoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

@Service
public class ConvoService {

    @Autowired
    ConvoRepo convoRepo;

    @Autowired
    ChatService chatService;

    public void addConvo(ConvoDto convoDto){
        String chatId = convoDto.getChatId();
        Timestamp now = Timestamp.from(Instant.now());
        Chat chat = chatService.getChatByTelegramId(chatId);
        Convo convo = new Convo(
                convoDto.getUserMessage(),
                convoDto.getBotMessage(),
                now,
                chat
        );

        convoRepo.save(convo);
    }
}
