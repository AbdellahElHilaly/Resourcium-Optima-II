package com.youcode.app.dao.base.service;

import com.youcode.app.dao.base.model.Entity.Equipment;

public interface EquipmentService {
    public Equipment saveEquipment(Equipment equipment);

    Equipment fndById(Long id);
    Equipment updateEquipment(Equipment equipment);
}
