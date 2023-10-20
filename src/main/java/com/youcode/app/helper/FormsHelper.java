package com.youcode.app.helper;

import com.youcode.app.dao.base.model.Builder.EmployeeBuilder;
import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.utils.db.enums.EmployeeRolesEnum;
import jakarta.servlet.http.HttpServletRequest;

public class FormsHelper {
    private static HttpServletRequest request;
    public  Employee getRegisterEmployee(HttpServletRequest req) {
        request = req;
        return new EmployeeBuilder(get("firstName"), get("email"), get("password"))
                .lastName(get("lastName"))
                .phone(get("phone"))
                .image(get("image"))
                .role(EmployeeRolesEnum.EMPLOYEE)
                .build();
    }

    private static String get(String key) {
        return request.getParameter(key);
    }

    public Employee getLoginEmployee(HttpServletRequest req) {
        request = req;
        return new EmployeeBuilder(get("email"), get("password")).build();
    }
}
