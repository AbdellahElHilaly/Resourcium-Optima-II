package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentStatusRepository implements JpaRepository<EquipmentStatus> {
    @Override
    public Class<EquipmentStatus> getEntityClass() {
        return EquipmentStatus.class;
    }
}
