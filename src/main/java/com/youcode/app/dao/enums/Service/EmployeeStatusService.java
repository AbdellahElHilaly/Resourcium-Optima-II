package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.EmployeeStatus;
import com.youcode.utils.db.enums.EmployeeStatusEnum;

import java.util.List;

public interface EmployeeStatusService {

    public  void addEmployeeStatus(EmployeeStatusEnum status);
    public List<EmployeeStatus> getAllEmployeeStatus();
}
