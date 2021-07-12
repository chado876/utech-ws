package com.utech.api.utechws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Convo extends  UUIDModel {

    private String userMessage;
    private String botMessage;
    private Timestamp dateCreated;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_convo_chat"))
    private Chat chat;
}
