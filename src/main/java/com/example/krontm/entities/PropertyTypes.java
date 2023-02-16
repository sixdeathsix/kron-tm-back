package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PropertyTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer property_type_id;

    @Column(nullable = false)
    private String property_type;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "types")
    private Properties properties;

    public PropertyTypes() {}
}
