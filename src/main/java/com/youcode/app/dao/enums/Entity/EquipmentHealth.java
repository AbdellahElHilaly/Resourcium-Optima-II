package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.EquipmentHealthEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class EquipmentHealth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EquipmentHealthEnum name;

    public EquipmentHealth() {
    }

    public EquipmentHealth(EquipmentHealthEnum health) {
        this.name = health;
    }

}
