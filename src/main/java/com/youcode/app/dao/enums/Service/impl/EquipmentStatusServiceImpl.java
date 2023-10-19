package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Service.EquipmentStatusService;
import com.youcode.app.dao.enums.Entity.EquipmentStatus;
import com.youcode.utils.db.enums.EquipmentStatusEnum;
import com.youcode.app.dao.enums.Repository.EquipmentStatusRepository;

import java.util.List;

public class EquipmentStatusServiceImpl implements EquipmentStatusService {
    private final EquipmentStatusRepository equipmentStatusRepository = new EquipmentStatusRepository();
    @Override
    public void addEquipmentStatus(EquipmentStatusEnum status) {
        equipmentStatusRepository.save(new EquipmentStatus(status));
    }

    @Override
    public List<EquipmentStatus> getAllEquipmentStatus() {
        return equipmentStatusRepository.selectAll();
    }
}
