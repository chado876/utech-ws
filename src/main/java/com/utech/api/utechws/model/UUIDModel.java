package com.utech.api.utechws.model;

import org.hibernate.annotations.Type;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class UUIDModel {
    @Id @Type(type = "pg-uuid")
    private UUID id;

    public UUIDModel() {
        this.id = UUID.randomUUID();
    }
}
