package com.utech.api.utechws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Module extends UUIDModel {
    private String moduleCode;
    private String name;
    private int credits;
    private double cost;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_module_tutor"))
    private Tutor tutor;
}
