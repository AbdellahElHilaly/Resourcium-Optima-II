package com.youcode.app.dao.enums.Service;

import com.youcode.app.dao.enums.Entity.EmployeeRole;
import com.youcode.utils.db.enums.EmployeeRolesEnum;

import java.util.List;
import java.util.Map;

public interface EmployeeRoleService {
    public void addEmployeeRole(EmployeeRolesEnum role);
    public List<EmployeeRole> getAllEmployeeRoles();

    EmployeeRole findBy(Map<String, Object> roleMap);
}
