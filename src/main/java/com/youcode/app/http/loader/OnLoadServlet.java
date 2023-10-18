package com.youcode.app.http.loader;

import com.youcode.app.root.EnumsInitializer;
import com.youcode.libs.print.Printer;
import com.youcode.utils.db.Manager.HibernateManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(
        name = "OnLoadServlet",
        urlPatterns = {"/OnLoadServlet"},
        initParams = {
                @WebInitParam(name = "paramName", value = "paramValue")
        },
        loadOnStartup = 1
)
public class OnLoadServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        startHibernate();
        initEnums();
    }

    private void initEnums() {
        EnumsInitializer enumsInitializer = new EnumsInitializer();
        enumsInitializer.init();
        enumsInitializer = null;
    }


    private void startHibernate() {
        HibernateManager.start();
    }
}
