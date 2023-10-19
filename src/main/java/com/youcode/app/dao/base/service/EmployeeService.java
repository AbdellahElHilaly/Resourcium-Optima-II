package com.youcode.app.dao.base.service;

import com.youcode.app.dao.base.model.Entity.Employee;

import java.net.Authenticator;

public interface EmployeeService {


    public  Employee register(Employee employee);
    public Employee login(Employee employee);


}
