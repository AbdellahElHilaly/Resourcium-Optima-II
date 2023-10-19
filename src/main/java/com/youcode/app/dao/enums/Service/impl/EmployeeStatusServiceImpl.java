package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Repository.EmployeeStatusRepository;
import com.youcode.app.dao.enums.Service.EmployeeStatusService;
import com.youcode.app.dao.enums.Entity.EmployeeStatus;
import com.youcode.utils.db.enums.EmployeeStatusEnum;

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
