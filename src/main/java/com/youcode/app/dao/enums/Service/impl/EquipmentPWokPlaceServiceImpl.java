package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.EquipmentWokPlace;
import com.youcode.app.dao.enums.Repository.EquipmentPWokPlaceRepository;
import com.youcode.app.dao.enums.Service.EquipmentPWokPlaceService;
import com.youcode.utils.db.enums.EquipmentWokPlaceEnum;

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
