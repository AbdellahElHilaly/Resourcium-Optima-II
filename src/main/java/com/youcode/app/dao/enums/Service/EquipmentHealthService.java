package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.EquipmentHealth;
import com.youcode.utils.db.enums.EquipmentHealthEnum;

import java.util.List;

public interface EquipmentHealthService {

    public  void addEquipmentHealth(EquipmentHealthEnum health);
    public List<EquipmentHealth> getAllEquipmentHealth();

}
