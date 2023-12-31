package com.main.consolemanagement.model;

import com.main.consolemanagement.model.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.mapping.Set;

import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "roles")
public class Role extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rank_id")
    private Rank rank;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private List<Permission> permissions;
}
