package com.youcode.app.dao.service.impl;

import com.youcode.app.dao.model.Entity.Enum_Etity.EmployeeRole;
import com.youcode.app.dao.model.Enum.EmployeeRolesEnum;
import com.youcode.app.dao.repository.EmployeeRoleRepository;
import com.youcode.app.dao.service.EmployeeRoleService;
import com.youcode.libs.print.Printer;

import java.util.List;

public class EmployeeRoleServiceImp implements EmployeeRoleService {
    private final EmployeeRoleRepository employeeRoleRepository = new EmployeeRoleRepository();

    public EmployeeRoleServiceImp() {
        Printer.info("EmployeeRoleServiceImp created");
    }

    @Override
    public void addEmployeeRole(EmployeeRolesEnum role) {
        EmployeeRole employeeRole = new EmployeeRole(role);
        employeeRoleRepository.save(employeeRole);
        employeeRole = null;
    }

    @Override
    public List<EmployeeRole> getAllEmployeeRoles() {
        return employeeRoleRepository.selectAll();
    }


}
