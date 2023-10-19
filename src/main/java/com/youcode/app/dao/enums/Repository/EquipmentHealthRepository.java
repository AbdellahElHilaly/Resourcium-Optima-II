package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.EquipmentHealth;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentHealthRepository implements JpaRepository<EquipmentHealth> {
    @Override
    public Class<EquipmentHealth> getEntityClass() {
        return EquipmentHealth.class;
    }
}
