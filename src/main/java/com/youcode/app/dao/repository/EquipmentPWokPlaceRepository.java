package com.youcode.app.dao.repository;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentWokPlace;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentPWokPlaceRepository implements JpaRepository<EquipmentWokPlace> {
    @Override
    public Class<EquipmentWokPlace> getEntityClass() {
        return EquipmentWokPlace.class;
    }
}
