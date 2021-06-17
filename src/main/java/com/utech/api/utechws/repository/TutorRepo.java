package com.utech.api.utechws.repository;

import com.utech.api.utechws.model.Tutor;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TutorRepo extends CrudRepository<Tutor, UUID> {
}
