package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.EquipmentHealth;
import com.youcode.app.dao.enums.Repository.EquipmentHealthRepository;
import com.youcode.app.dao.enums.Service.EquipmentHealthService;
import com.youcode.utils.db.enums.EquipmentHealthEnum;

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
