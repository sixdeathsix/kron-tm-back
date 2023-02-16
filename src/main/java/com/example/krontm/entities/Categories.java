package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;

    @Column(nullable = false)
    private String category;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "categories")
    private Events events;

    public Categories() {}
}
