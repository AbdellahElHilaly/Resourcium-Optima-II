package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.EmployeeRole;
import com.youcode.app.dao.enums.Repository.EmployeeRoleRepository;
import com.youcode.app.dao.enums.Service.EmployeeRoleService;
import com.youcode.utils.db.enums.EmployeeRolesEnum;
import com.youcode.libs.print.Printer;

import java.util.List;
import java.util.Map;

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

    @Override
    public EmployeeRole findBy(Map<String, Object> roleMap) {
        return employeeRoleRepository.findBy(roleMap);
    }


}
