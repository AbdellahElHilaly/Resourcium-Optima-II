package com.youcode.app.dao.enums.Service.impl;

import com.youcode.app.dao.enums.Entity.EmployeeRole;
import com.youcode.app.dao.enums.Service.EmployeeRoleService;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.utils.db.enums.EmployeeRolesEnum;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRoleServiceImpTest {


    @Test
    void findBy() {
        EmployeeRoleService employeeRoleService = new EmployeeRoleServiceImp();

        Map<String, Object> roleMap = Map.of(
                "name", EmployeeRolesEnum.RH
        );

        ObjectPrinter.table(employeeRoleService.findBy(roleMap), "employeeRole");

    }


    @Test
    void addEmployeeRole() {
    }

    @Test
    void getAllEmployeeRoles() {
    }
}