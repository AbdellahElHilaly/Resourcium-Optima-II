package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentStatus;
import com.youcode.app.dao.model.Enum.EquipmentStatusEnum;

import java.util.List;

public interface EquipmentStatusService {
    public  void addEquipmentStatus(EquipmentStatusEnum status);
    public List<EquipmentStatus>  getAllEquipmentStatus();
}
