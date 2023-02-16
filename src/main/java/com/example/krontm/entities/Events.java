package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_id;

    @Column(nullable = false)
    private LocalDateTime eventDateTime;

    @ManyToOne
    @JoinColumn(name = "property_id", nullable = false)
    private Properties properties;

    @OneToOne
    @JoinColumn(name = "event_type_id", nullable = false)
    private EventTypes eventTypes;

    @OneToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categories categories;

    public Events() {}
}
