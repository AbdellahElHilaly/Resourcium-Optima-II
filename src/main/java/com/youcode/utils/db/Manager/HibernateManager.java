package com.youcode.utils.db.Manager;

import com.youcode.libs.print.Printer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class HibernateManager {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static EntityTransaction transaction;

    public static void start(){
        Printer.warning("Starting HibernateManager");

        entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-unit");

        Printer.success("HibernateManager started");
    }

    public static EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }




    private static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
            start();
        }
        return entityManagerFactory;
    }


    public static void openAll() {
        openEntityManager();
        openTransaction();
    }

    public static void closeAll(){
        closeEntityManager();
        closeTransaction();
    }








    private static void openTransaction() {
        transaction = entityManager.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
    }

    private static void openEntityManager() {
        entityManager = getEntityManager();
    }

    private static void closeTransaction() {
        if (transaction != null && transaction.isActive()) {
            transaction.rollback();
        }
    }

    public static void closeEntityManager() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

}
