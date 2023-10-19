package com.youcode.app.http.controller;

import com.youcode.app.helper.ViewHelper;
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
            case "logout":
                logout(req, resp);
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
        ViewHelper.showWaitingPage(req, resp, "Logging in employee...");
    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ViewHelper.showWaitingPage(req, resp, "Registering employee...");
    }

    private void show(HttpServletRequest req, HttpServletResponse resp) {
        ViewHelper.showWaitingPage(req, resp, "Fetching employee data...");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        ViewHelper.showWaitingPage(req, resp, "Deleting employee...");
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        ViewHelper.showWaitingPage(req, resp, "Updating employee...");
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) {
        ViewHelper.showWaitingPage(req, resp, "Logging out employee...");
    }
}
