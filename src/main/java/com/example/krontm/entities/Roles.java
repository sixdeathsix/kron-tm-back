package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;

    @Column(nullable = false)
    private String role;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "roles")
    private Users users;

    public Roles() {}
}
