package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentWokPlace;
import com.youcode.app.dao.model.Enum.EquipmentWokPlaceEnum;
import com.youcode.app.dao.repository.EquipmentPWokPlaceRepository;
import com.youcode.app.dao.service.EquipmentPWokPlaceService;

import java.util.List;

public class EquipmentPWokPlaceServiceImpl implements EquipmentPWokPlaceService {
    private  final EquipmentPWokPlaceRepository equipmentPWokPlaceRepository = new EquipmentPWokPlaceRepository();
    @Override
    public void addEquipmentPWokPlace(EquipmentWokPlaceEnum equipmentPWokPlaceEnum) {
        equipmentPWokPlaceRepository.save(new EquipmentWokPlace(equipmentPWokPlaceEnum));
    }

    @Override
    public List<EquipmentWokPlace> getAllEquipmentPWokPlace() {
        return equipmentPWokPlaceRepository.selectAll();
    }
}
