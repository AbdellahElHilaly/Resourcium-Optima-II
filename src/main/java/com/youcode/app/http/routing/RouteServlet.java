package com.youcode.app.http.routing;

import com.youcode.app.helper.AppHelper;
import com.youcode.libs.print.Printer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RouteServlet", urlPatterns = {"/Router"})
public class RouteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        gotoRoute(req, resp);
    }

    private void gotoRoute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageParam = req.getParameter("page");
        if (pageParam == null) {
            pageParam = "home";
        }

        String route = AppHelper.toCamelCase(pageParam);
        String jspPage;

        switch (route) {
            case "home":
                jspPage = "/view/index.jsp";
                break;
            case "dashboard":
                jspPage = "/view/pages/dashboard.jsp";
                break;
            case "login":
                jspPage = "/view/pages/login.jsp";
                break;
            case "register":
                jspPage = "/view/pages/register.jsp";
                break;
            case "profile":
                jspPage = "/view/pages/profile.jsp";
                break;
            default:
                jspPage = "/view/pages/404.jsp";
                break;
        }
        req.getRequestDispatcher(jspPage).forward(req, resp);
    }


}
