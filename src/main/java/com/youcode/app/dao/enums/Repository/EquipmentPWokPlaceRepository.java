package com.youcode.app.dao.enums.Repository;

import com.youcode.app.dao.enums.Entity.EquipmentWokPlace;
import com.youcode.utils.db.dao.JpaRepository;

public class EquipmentPWokPlaceRepository implements JpaRepository<EquipmentWokPlace> {
    @Override
    public Class<EquipmentWokPlace> getEntityClass() {
        return EquipmentWokPlace.class;
    }
}
