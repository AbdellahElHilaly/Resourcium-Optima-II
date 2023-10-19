package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.EquipmentStatus;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentStatusRepository implements JpaRepository<EquipmentStatus> {
    @Override
    public Class<EquipmentStatus> getEntityClass() {
        return EquipmentStatus.class;
    }
}
