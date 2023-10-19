package com.youcode.app.http.loader;

import com.youcode.app.root.DatabaseInitialization;
import com.youcode.utils.app.Config.AppConfig;
import com.youcode.utils.app.Enum.RunMoods;
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
        if (AppConfig.RUN_MOOD == RunMoods.Development) {
            initEnums();
        }

    }

    private void initEnums() {
        DatabaseInitialization databaseInitialization = new DatabaseInitialization();
        databaseInitialization.init();
        databaseInitialization = null;
    }


    private void startHibernate() {
        HibernateManager.openAll();
    }
}
