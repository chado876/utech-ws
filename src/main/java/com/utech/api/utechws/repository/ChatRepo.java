package com.utech.api.utechws.repository;

import com.utech.api.utechws.model.Chat;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface ChatRepo extends CrudRepository<Chat, UUID> {

    Optional<Chat> getChatByUserTelegramId(String userTelegramId);

}
