package com.youcode.app.dao.base.model.Builder;

import com.youcode.app.dao.base.model.Entity.Department;
import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.app.dao.base.model.Entity.Task;
import com.youcode.app.dao.enums.Entity.AccountStatus;
import com.youcode.app.dao.enums.Entity.EmployeeRole;
import com.youcode.app.dao.enums.Entity.EmployeeStatus;
import com.youcode.app.helper.SecurityHelper;
import com.youcode.utils.db.enums.AccountStatusEnum;
import com.youcode.utils.db.enums.EmployeeRolesEnum;
import com.youcode.utils.db.enums.EmployeeStatusEnum;

import java.util.List;

public class EmployeeBuilder {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String image;
    private Department department;
    private List<Task> tasks;
    private EmployeeRole role;
    private EmployeeStatus status;
    private AccountStatus accountStatus;

     public EmployeeBuilder(String firstName, String email , String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = SecurityHelper.hashPassword(password);

    }

    public EmployeeBuilder(String email , String password) {
        this.email = email;
        this.password = password;
    }

    public EmployeeBuilder id(Long id) {
        this.id = id;
        return this;
    }


    public EmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public EmployeeBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder image(String image) {
        this.image = image;
        return this;
    }

    public EmployeeBuilder department(Department department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder tasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    public EmployeeBuilder role(EmployeeRolesEnum role) {
        this.role = new EmployeeRole(role);
        return this;
    }

    public EmployeeBuilder status(EmployeeStatusEnum status) {
        this.status = new EmployeeStatus(status);
        return this;
    }

    public EmployeeBuilder accountStatus(AccountStatusEnum accountStatus) {
        this.accountStatus = new AccountStatus(accountStatus);
        return this;
    }

    public Employee build() {
        Employee employee = new Employee();
        employee.setId(this.id);
        employee.setFirstName(this.firstName);
        employee.setLastName(this.lastName);
        employee.setEmail(this.email);
        employee.setPassword(this.password);
        employee.setPhone(this.phone);
        employee.setImage(this.image);
        employee.setDepartment(this.department);
        employee.setTasks(this.tasks);
        employee.setRole(this.role);
        employee.setStatus(this.status);
        employee.setAccountStatus(this.accountStatus);
        return employee;
    }
}
