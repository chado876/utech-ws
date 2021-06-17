package com.utech.api.utechws.repository;

import com.utech.api.utechws.model.Module;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ModuleRepo extends CrudRepository<Module, UUID> {

}
