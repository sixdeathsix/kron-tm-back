package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Genders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gender_id;

    @Column(nullable = false)
    private String gender;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "genders")
    private Users users;

    public Genders() {}
}
