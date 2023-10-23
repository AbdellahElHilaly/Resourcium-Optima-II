package com.youcode.app.dao.base.service.impl;

import com.youcode.app.dao.base.model.Builder.EmployeeBuilder;
import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.app.dao.base.service.EmployeeService;
import com.youcode.app.dao.enums.Entity.AccountStatus;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.utils.db.enums.AccountStatusEnum;
import com.youcode.utils.db.enums.EmployeeRolesEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {



    @Test
    void register() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new EmployeeBuilder("abdellah", "mail@gmail.com", "1234")
                .lastName("el hilaly")
                .phone("0612345678")
                .role(EmployeeRolesEnum.ADMIN)
                .build();

       ObjectPrinter.table(employeeService.register(employee), "employee registered");

    }

    @Test
    void login() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new EmployeeBuilder("admin@gmail.com","123456789")
                .build();

        ObjectPrinter.table(employeeService.selectByEmployeeEmail(employee), "employee logged in");
    }


    @Test
    void updateProfile() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new EmployeeBuilder("admin@gmail.com","").build();

        Employee employee2 = employeeService.selectByEmployeeEmail(employee);
        employee2.setFirstName("name updated 2");

        ObjectPrinter.json(employeeService.updateProfile(employee2), "employee updated");
    }
}