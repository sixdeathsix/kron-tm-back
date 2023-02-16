package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ObjectTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer object_type_id;
    @Column(nullable = false)
    private String object_type;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "objectTypes")
    private Objects objects;

    public ObjectTypes() {}
}
