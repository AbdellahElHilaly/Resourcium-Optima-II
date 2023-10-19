package com.youcode.app.root;

import com.youcode.app.dao.init.EnumInitializer;
import com.youcode.libs.print.Printer;

public class DatabaseInitialization {

    public void init() {
        initEnums();
    }



    private void initEnums() {

        EnumInitializer enumInitializer = new EnumInitializer();

        Printer.warning("Starting EnumsInitializer");

        enumInitializer.initRoles();
        enumInitializer.initEmployeeStatus();
        enumInitializer.initAccountStatus();
        enumInitializer.initEquipmentHealth();
        enumInitializer.initEquipmentStatus();
        enumInitializer.initEquipmentPWokPlace();
        enumInitializer.initTskStatus();
        enumInitializer.initTaskDifficulty();
        enumInitializer.initTaskType();
        enumInitializer.initTaskPriority();

        Printer.success("EnumsInitializer started");

        enumInitializer = null;
    }


}