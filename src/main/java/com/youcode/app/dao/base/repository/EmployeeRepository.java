package com.youcode.app.dao.base.repository;

import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.utils.db.dao.JpaRepository;

public class EmployeeRepository implements JpaRepository<Employee> {

    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }

}
