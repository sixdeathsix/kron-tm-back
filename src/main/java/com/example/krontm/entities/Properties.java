package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer property_id;

    @ManyToOne
    @JoinColumn(name = "object_id", nullable = false)
    private Objects objects;

    @OneToOne
    @JoinColumn(name = "property_type_id", nullable = false)
    private PropertyTypes types;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "properties")
    private List<Events> events;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "properties")
    private List<PropertyLogs> propertyLogs;

    public Properties() {}
}
