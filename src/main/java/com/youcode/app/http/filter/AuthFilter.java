package com.youcode.app.http.filter;

import java.io.IOException;
import java.util.List;

import com.youcode.app.helper.SecurityHelper;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter(
        filterName = "AuthenticationFilter", urlPatterns = {"/Router"})
public class AuthFilter implements Filter {

    private final List<String> securityPages = List.of(
            "profile",
            "logout",
            "dashboard"
    );

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String pageParam = (request.getParameter("page") != null) ? request.getParameter("page").toLowerCase() : "404";

        if (securityPages.contains(pageParam)) {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse resp = (HttpServletResponse) response;

            if (SecurityHelper.isEmployeeLoggedIn(req)) {
                chain.doFilter(request, response);
            } else {
                resp.sendRedirect("Router?page=login");
            }
        } else {
            chain.doFilter(request, response);
        }

    }

}































