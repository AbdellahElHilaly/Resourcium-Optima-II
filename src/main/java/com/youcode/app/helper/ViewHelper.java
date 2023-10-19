package com.youcode.app.helper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ViewHelper {

    public static void showWaitingPage(HttpServletRequest req, HttpServletResponse resp, String message) {
        req.setAttribute("message", message);
        try {
            req.getRequestDispatcher("/view/pages/waiting.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
