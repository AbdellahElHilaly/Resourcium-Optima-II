package com.youcode.app.helper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ViewHelper {

    public  static  String getAvatarPath(HttpServletRequest req) {
        if(SecurityHelper.getSessionEmployee(req)!= null) {
            return SecurityHelper.getSessionEmployee(req).getImage();
        } else {
            return "https://img.myloview.com/stickers/default-avatar-profile-icon-vector-social-media-user-image-700-205124837.jpg";
        }
    }

    public static void gotoWaitingPage(HttpServletRequest req, HttpServletResponse resp, String message) {
        req.setAttribute("message", message);
        try {
            req.getRequestDispatcher("/view/pages/waiting.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void goToHome(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect(req.getContextPath() + "/Router?page=home");
    }

    public static void gotoSuccessPage(HttpServletRequest req, HttpServletResponse resp, String message , String next) throws IOException {
        req.setAttribute("message", message);
        req.setAttribute("next", next);
        try {
            req.getRequestDispatcher("/view/pages/200.jsp").forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public static void gotoErrorPage(HttpServletRequest req, HttpServletResponse resp, String error, String next) throws IOException {
        req.setAttribute("error", error);
        req.setAttribute("next", next);
        try {
            req.getRequestDispatcher("/view/pages/500.jsp").forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public static void gotoLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect(req.getContextPath() + "/Router?page=login");
    }
}
