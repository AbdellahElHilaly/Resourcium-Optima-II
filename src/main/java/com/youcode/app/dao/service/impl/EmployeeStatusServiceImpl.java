package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.EmployeeStatus;
import com.youcode.app.dao.model.Enum.EmployeeStatusEnum;
import com.youcode.app.dao.repository.EmployeeStatusRepository;
import com.youcode.app.dao.service.EmployeeStatusService;

import java.util.List;

public class EmployeeStatusServiceImpl implements EmployeeStatusService {

    private final EmployeeStatusRepository employeeStatusRepository = new EmployeeStatusRepository();

    @Override
    public void addEmployeeStatus(EmployeeStatusEnum status) {
        employeeStatusRepository.save(new EmployeeStatus(status));
    }

    @Override
    public List<EmployeeStatus> getAllEmployeeStatus() {
        return employeeStatusRepository.selectAll();
    }
}
