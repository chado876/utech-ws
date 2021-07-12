package com.utech.api.utechws.service;

import com.utech.api.utechws.dto.ChatDto;
import com.utech.api.utechws.model.Chat;
import com.utech.api.utechws.model.Module;
import com.utech.api.utechws.repository.ChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChatService {

    @Autowired
    ChatRepo chatRepo;

    public void addChat(ChatDto chatDto){
        String userTelegramId = chatDto.getUserTelegramId();
        Timestamp now = Timestamp.from(Instant.now());
        Chat chat = new Chat(
                userTelegramId,
                now
        );

        Optional<Chat> existingChat = chatRepo.getChatByUserTelegramId(userTelegramId);
        if (!existingChat.isPresent()){
            chatRepo.save(chat);
        }
    }

    public Chat getChatByTelegramId(String telegramId) {
        Optional<Chat> chat = chatRepo.getChatByUserTelegramId(telegramId);
        return chat.get();
    }
}
