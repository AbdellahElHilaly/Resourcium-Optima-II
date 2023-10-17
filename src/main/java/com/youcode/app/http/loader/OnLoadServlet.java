package com.youcode.app.http.load;

import com.youcode.utils.db.Manager.HibernateManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(
        name = "ServletLoader",
        urlPatterns = {"/ServletLoader"},
        initParams = {
                @WebInitParam(name = "paramName", value = "paramValue")
        },
        loadOnStartup = 1
)

public class ServletLoader extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        HibernateManager.start();
    }

}
