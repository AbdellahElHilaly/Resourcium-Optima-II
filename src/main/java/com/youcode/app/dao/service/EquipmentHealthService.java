package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.EquipmentHealth;
import com.youcode.app.dao.model.Enum.EquipmentHealthEnum;

import java.util.List;

public interface EquipmentHealthService {

    public  void addEquipmentHealth(EquipmentHealthEnum health);
    public List<EquipmentHealth> getAllEquipmentHealth();

}
