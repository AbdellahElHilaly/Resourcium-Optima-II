package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.EquipmentWokPlace;
import com.youcode.utils.db.enums.EquipmentWokPlaceEnum;

import java.util.List;

public interface EquipmentPWokPlaceService {
    public void addEquipmentPWokPlace(EquipmentWokPlaceEnum equipmentPWokPlaceEnum);
    public List<EquipmentWokPlace> getAllEquipmentPWokPlace();
}
