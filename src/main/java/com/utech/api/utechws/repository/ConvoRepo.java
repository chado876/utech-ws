package com.utech.api.utechws.repository;

import com.utech.api.utechws.model.Chat;
import com.utech.api.utechws.model.Convo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ConvoRepo extends CrudRepository<Convo, UUID> {
    Convo findTopByOrderByDateCreatedDesc();

    @Query("SELECT c from Convo c WHERE c.chatId = ?1 ORDER BY c.dateCreated desc")
    List<Convo> findMostRecentByChatId(String chatId);
}
