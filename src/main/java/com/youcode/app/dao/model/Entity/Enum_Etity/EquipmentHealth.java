package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.EquipmentHealthEnum;
import jakarta.persistence.*;

@Entity
public class EquipmentHealth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EquipmentHealthEnum health;

    public EquipmentHealth() {
    }

    public EquipmentHealth(EquipmentHealthEnum health) {
        this.health = health;
    }

    public EquipmentHealthEnum getHealth() {
        return health;
    }
}
