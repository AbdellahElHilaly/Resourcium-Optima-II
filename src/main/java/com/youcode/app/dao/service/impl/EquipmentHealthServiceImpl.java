package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentHealth;
import com.youcode.app.dao.model.Enum.EquipmentHealthEnum;
import com.youcode.app.dao.repository.EquipmentHealthRepository;
import com.youcode.app.dao.service.EquipmentHealthService;

import java.util.List;

public class EquipmentHealthServiceImpl implements EquipmentHealthService {

    private final EquipmentHealthRepository equipmentHealthRepository = new EquipmentHealthRepository();

    @Override
    public void addEquipmentHealth(EquipmentHealthEnum health) {

        equipmentHealthRepository.save(new EquipmentHealth(health));

    }

    @Override
    public List<EquipmentHealth> getAllEquipmentHealth() {
        return equipmentHealthRepository.selectAll();
    }
}
