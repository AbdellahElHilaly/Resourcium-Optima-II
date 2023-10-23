package com.youcode.app.http.controller;

import com.youcode.app.dao.base.model.Entity.Employee;
import com.youcode.app.dao.base.service.EmployeeService;
import com.youcode.app.dao.base.service.impl.EmployeeServiceImpl;
import com.youcode.app.helper.AppHelper;
import com.youcode.app.helper.FormsHelper;
import com.youcode.app.helper.SecurityHelper;
import com.youcode.app.helper.ViewHelper;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "EmployeeController",
        urlPatterns = {"/Employee"},
        initParams = {
                @WebInitParam(name = "paramName", value = "paramValue")
        }
)
public class EmployeeController extends HttpServlet {

    private final EmployeeService employeeService = new EmployeeServiceImpl();
    private final FormsHelper formsHelper = new FormsHelper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handelGetRequest(req, resp);
    }

    private void handelGetRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String pageParam = (req.getParameter("action") != null) ? req.getParameter("action") : "404";

        String route = AppHelper.toCamelCase(pageParam);

        if(route.equals("logout")) {
            logout(req, resp);
        }else {
            ViewHelper.goToHome(req, resp);
        }



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "register":
                register(req, resp);
                break;
            case "login":
                login(req, resp);
                break;
            case "update":
                update(req, resp);
                break;
            case "delete":
                delete(req, resp);
                break;
            case "show":
                show(req, resp);
                break;
            default:
                resp.getWriter().println("404");
                break;
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Employee localEmployee = formsHelper.getLoginEmployee(req);
        ObjectPrinter.json(localEmployee, "localEmployee");
        Employee serverEmployee = employeeService.selectByEmployeeEmail(localEmployee);

        if (serverEmployee != null) {
            if(!SecurityHelper.checkPassword(localEmployee.getPassword(), serverEmployee.getPassword())) {
                ViewHelper.gotoErrorPage(req, resp, "Wrong password", "login");
                return;
            }

            SecurityHelper.sessionLogin(req, serverEmployee);
            ViewHelper.gotoSuccessPage(req, resp, "Logged in successfully.", "home");

        } else {
            ViewHelper.gotoErrorPage(req, resp, "Your email is not registered!", "register");
        }
    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        if (employeeService.register(formsHelper.getRegisterEmployee(req)) != null) {
            ViewHelper.gotoSuccessPage(req, resp, "Registered successfully.", "login");
        } else {
            ViewHelper.gotoErrorPage(req, resp, "Error while registering employee!", "register");
        }
    }


    private void show(HttpServletRequest req, HttpServletResponse resp) {
        ViewHelper.gotoWaitingPage(req, resp, "Fetching employee data...");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        SecurityHelper.logout(req);
        ViewHelper.gotoSuccessPage(req, resp, "Logged out successfully.", "login");
    }
}
