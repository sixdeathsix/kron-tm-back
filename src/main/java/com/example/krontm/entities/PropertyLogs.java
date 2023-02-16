package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class PropertyLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer property_log_id;

    @Column(nullable = false)
    private String value;

    @Column(nullable = false)
    private LocalDateTime update_date;

    @ManyToOne
    @JoinColumn(name = "property_id", nullable = false)
    private Properties properties;

    @OneToOne
    @JoinColumn(name = "value_type_id", nullable = false)
    private ValueTypes valueTypes;

    public PropertyLogs() {}
}
