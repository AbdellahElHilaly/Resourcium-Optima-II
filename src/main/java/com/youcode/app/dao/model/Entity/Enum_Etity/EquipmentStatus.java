package com.youcode.app.dao.model.Entity.Enum_Etity;

import com.youcode.app.dao.model.Enum.EquipmentStatusEnum;
import jakarta.persistence.*;

@Entity
public class EquipmentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private EquipmentStatusEnum status;

    public EquipmentStatus() {

    }

    public EquipmentStatus(EquipmentStatusEnum status) {
        this.status = status;
    }

    public EquipmentStatusEnum getStatus() {
        return status;
    }
}
