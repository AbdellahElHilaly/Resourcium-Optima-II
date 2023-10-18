package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentWokPlace;
import com.youcode.app.dao.model.Enum.EquipmentWokPlaceEnum;

import java.util.List;

public interface EquipmentPWokPlaceService {
    public void addEquipmentPWokPlace(EquipmentWokPlaceEnum equipmentPWokPlaceEnum);
    public List<EquipmentWokPlace> getAllEquipmentPWokPlace();
}
