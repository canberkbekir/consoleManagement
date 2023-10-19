package com.main.consolemanagement.model.base;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Timestamp deleted_at;
    private final boolean active = true;

}
