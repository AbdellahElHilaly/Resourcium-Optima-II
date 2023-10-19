package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.EquipmentStatus;
import com.youcode.utils.db.enums.EquipmentStatusEnum;

import java.util.List;

public interface EquipmentStatusService {
    public  void addEquipmentStatus(EquipmentStatusEnum status);
    public List<EquipmentStatus>  getAllEquipmentStatus();
}
