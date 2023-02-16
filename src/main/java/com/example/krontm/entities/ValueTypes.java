package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ValueTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer value_type_id;

    @Column(nullable = false)
    private String value_type;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "valueTypes")
    private PropertyLogs propertyLogs;

    public ValueTypes() {}
}
