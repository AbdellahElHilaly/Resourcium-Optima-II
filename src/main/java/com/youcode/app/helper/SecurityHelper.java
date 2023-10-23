package com.youcode.app.helper;

import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.libs.print.ObjectPrinter;
import jakarta.servlet.http.HttpServletRequest;
import org.mindrot.jbcrypt.BCrypt;

public class SecurityHelper {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }

    public static void sessionLogin(HttpServletRequest req, Employee logInEmployee) {
        req.getSession().setAttribute(" logInEmployee", logInEmployee);
    }

    public static Employee getSessionEmployee(HttpServletRequest req) {
        return (Employee) req.getSession().getAttribute(" logInEmployee");
    }

    public static boolean isEmployeeLoggedIn(HttpServletRequest req) {
        return req.getSession().getAttribute(" logInEmployee") != null;
    }


    public static void logout(HttpServletRequest req) {
        req.getSession().removeAttribute(" logInEmployee");
    }
}
