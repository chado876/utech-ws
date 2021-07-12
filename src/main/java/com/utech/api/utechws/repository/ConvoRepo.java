package com.utech.api.utechws.repository;

import com.utech.api.utechws.model.Chat;
import com.utech.api.utechws.model.Convo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ConvoRepo extends CrudRepository<Convo, UUID> {
}
