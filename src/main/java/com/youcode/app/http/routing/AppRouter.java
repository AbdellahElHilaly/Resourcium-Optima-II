package com.youcode.app.http.routing;

import com.youcode.libs.print.Printer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/app/*"})
public class AppRouter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();

        if (path != null && path.length() > 1) {
            String pageName = path.substring(1);
            handelPageName(pageName, response, request);
        } else {
            goToHomePage(response, request);
        }
    }

    private void goToHomePage(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String jspPage = "/WEB-UI/index.jsp";
        request.getRequestDispatcher(jspPage).forward(request, response);
    }

    private void handelPageName(String pageName, HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        String jspPage;
        try {
            switch (pageName) {
                case "home":
                    jspPage = "/WEB-UI/index.jsp";
                    break;
                case "dashboard":
                    jspPage = "/WEB-UI/pages/dashboard.jsp";
                    break;
                case "login":
                    jspPage = "/WEB-UI/pages/login.jsp";
                    break;
                case "register":
                    jspPage = "/WEB-UI/pages/register.jsp";
                    break;
                case "profile":
                    jspPage = "/WEB-UI/pages/profile.jsp";
                    break;
                default:
                    jspPage = "/WEB-UI/pages/404.jsp";
                    break;
            }
            request.getRequestDispatcher(jspPage).forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            jspPage = "/WEB-UI/pages/500.jsp";
            request.getRequestDispatcher(jspPage).forward(request, response);
        }
    }
}

