package com.youcode.utils.db.enums;

public enum EmployeeRolesEnum {
    RH, EMPLOYEE, HEAD_OF_DEPARTMENT, TEAM_LEADER, ADMIN;
}


//can i display this enums in a jsp page? -> yes
/*

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.youcode.utils.db.enums.EmployeeRolesEnum" %>
<%
for (EmployeeRolesEnum value : EmployeeRolesEnum.values()) {
    System.out.println(value);

}
%>
 */