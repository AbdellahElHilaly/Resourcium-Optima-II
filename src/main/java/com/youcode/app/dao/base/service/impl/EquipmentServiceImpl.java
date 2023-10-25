package com.youcode.app.dao.base.service.impl;

import com.youcode.app.dao.base.model.Entity.Equipment;
import com.youcode.app.dao.base.repository.EquipmentRepository;
import com.youcode.app.dao.base.service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService {
    EquipmentRepository equipmentRepository = new EquipmentRepository();
    @Override
    public Equipment saveEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @Override
    public Equipment fndById(Long id) {
        return equipmentRepository.findById(id);
    }

    @Override
    public Equipment updateEquipment(Equipment equipment) {
        return equipmentRepository.update(equipment);
    }
}
