package com.youcode.app.dao.service;

import com.youcode.app.dao.model.Entity.Enum_Etity.EmployeeRole;
import com.youcode.app.dao.model.Enum.EmployeeRolesEnum;

import java.util.List;

public interface EmployeeRoleService {
    public void addEmployeeRole(EmployeeRolesEnum role);
    public List<EmployeeRole> getAllEmployeeRoles();
}
