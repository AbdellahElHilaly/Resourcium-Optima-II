package com.youcode.app.root;


import org.junit.jupiter.api.Test;

class EnumsInitializerTest {

    @Test
    void initRoles() {
        EnumsInitializer enumsInitializer = new EnumsInitializer();
        enumsInitializer.initRoles();
    }

    @Test
    void initEmployeeStatus() {
        EnumsInitializer enumsInitializer = new EnumsInitializer();
        enumsInitializer.initEmployeeStatus();
    }
}