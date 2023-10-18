package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentStatus;
import com.youcode.app.dao.model.Enum.EquipmentStatusEnum;
import com.youcode.app.dao.repository.EquipmentStatusRepository;
import com.youcode.app.dao.service.EquipmentStatusService;

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
