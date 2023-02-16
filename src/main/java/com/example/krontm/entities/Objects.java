package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Objects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer object_id;
    @Column(nullable = false)
    private String flange_no;
    @Column(nullable = false)
    private String description;

    @OneToOne
    @JoinColumn(name = "object_type_id", nullable = false)
    private ObjectTypes objectTypes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objects")
    private List<Properties> properties;

    public Objects() {}
}
