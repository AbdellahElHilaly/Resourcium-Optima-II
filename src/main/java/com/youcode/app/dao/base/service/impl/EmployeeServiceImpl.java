package com.youcode.app.dao.base.service.impl;

import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.app.dao.base.repository.EmployeeRepository;
import com.youcode.app.dao.base.service.EmployeeService;
import com.youcode.app.dao.enums.Repository.EmployeeRoleRepository;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository = new EmployeeRepository();
    EmployeeRoleRepository employeeRoleRepository = new EmployeeRoleRepository();


    @Override
    public Employee register(Employee employee) {

        Map<String, Object> roleMap = Map.of(
                "name", employee.getRole().getName()
        );

        employee.setRole(employeeRoleRepository.findBy(roleMap));

        return  employeeRepository.save(employee);
    }

    @Override
    public Employee selectByEmployeeEmail(Employee employee) {

        Map<String, Object> loginMap = Map.of(
                "email", employee.getEmail()
        );

        return employeeRepository.findBy(loginMap);
    }

}
