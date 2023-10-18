package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentHealth;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentHealthRepository implements JpaRepository<EquipmentHealth> {
    @Override
    public Class<EquipmentHealth> getEntityClass() {
        return EquipmentHealth.class;
    }
}
