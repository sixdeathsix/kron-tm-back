package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EventTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_type_id;

    @Column(nullable = false)
    private String event_type;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "eventTypes")
    private Events events;

    public EventTypes() {}
}
