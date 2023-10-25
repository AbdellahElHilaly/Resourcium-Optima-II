package com.youcode.app.dao.base.repository;

import com.youcode.app.dao.base.model.Entity.Equipment;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentRepository implements JpaRepository<Equipment>{
    @Override
    public Class<Equipment> getEntityClass() {
        return Equipment.class;
    }
}
