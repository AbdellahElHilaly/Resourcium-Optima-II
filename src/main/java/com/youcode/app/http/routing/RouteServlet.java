package com.youcode.app.http.routing;

import com.youcode.app.helper.AppHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "RouteServlet", urlPatterns = {"/Router"})
public class RouteServlet extends HttpServlet {
    private static final String NOT_FOUNT_PAGE = "404";
    private Map<String, String> pageMappings;

    @Override
    public void init() {
        pageMappings = new HashMap<>();
        pageMappings.put("home", "/view/index.jsp");
        pageMappings.put("dashboard", "/view/pages/dashboard.jsp");
        pageMappings.put("login", "/view/pages/login.jsp");
        pageMappings.put("register", "/view/pages/register.jsp");
        pageMappings.put("editprofile", "/view/pages/editprofile.jsp");
        pageMappings.put("profile", "/view/pages/profile.jsp");
        pageMappings.put("200", "/view/pages/200.jsp");
        pageMappings.put("500", "/view/pages/500.jsp");
        pageMappings.put("waiting", "/view/pages/waiting.jsp");
        pageMappings.put("404", "/view/pages/404.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        gotoRoute(req, resp);
    }

    private void gotoRoute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pageParam = (req.getParameter("page") != null) ? req.getParameter("page") : "404";

        String route = AppHelper.toCamelCase(pageParam);

        String jspPage = pageMappings.getOrDefault(route, pageMappings.get(NOT_FOUNT_PAGE));

        req.getRequestDispatcher(jspPage).forward(req, resp);

    }
}
