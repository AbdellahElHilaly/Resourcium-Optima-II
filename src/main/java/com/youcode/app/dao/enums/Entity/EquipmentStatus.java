package com.youcode.app.dao.enums.Entity;

import com.youcode.utils.db.enums.EquipmentStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class EquipmentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EquipmentStatusEnum name;

    public EquipmentStatus() {

    }

    public EquipmentStatus(EquipmentStatusEnum status) {
        this.name = status;
    }

}
