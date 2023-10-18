package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.EmployeeStatus;
import com.youcode.app.dao.model.Enum.EmployeeStatusEnum;

import java.util.List;

public interface EmployeeStatusService {

    public  void addEmployeeStatus(EmployeeStatusEnum status);
    public List<EmployeeStatus> getAllEmployeeStatus();
}
