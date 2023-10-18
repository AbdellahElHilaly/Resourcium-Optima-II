package com.youcode.utils.db.dao;

import com.youcode.utils.db.Manager.HibernateManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public interface JpaRepository<T> {

    EntityManager entityManager = HibernateManager.getEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

     Class<T> getEntityClass();

    default String getEntityName() {
        return getEntityClass().getSimpleName();
    }

    public default <T> T save(T t) {
        HibernateManager.openAll();
        try {
            transaction.begin();
            entityManager.persist(t);
            transaction.commit();
            return t;
        } finally {
            HibernateManager.closeAll();
        }

    }

    public default <T> T update(T t) {
        HibernateManager.openAll();
        try {
            transaction.begin();
            entityManager.merge(t);
            transaction.commit();
            return t;
        } finally {
            HibernateManager.closeAll();
        }
    }

    public default <T> void delete(T t) {
        HibernateManager.openAll();
        try {
            transaction.begin();
            entityManager.remove(t);
            transaction.commit();
        } finally {
            HibernateManager.closeAll();
        }
    }

    public default T findById(Long id) {
        HibernateManager.openAll();
        try {
            return entityManager.find(getEntityClass(), id);
        } finally {
            HibernateManager.closeAll();
        }
    }


    public default List<T> selectAll() {
        HibernateManager.openAll();
        try {
            return entityManager.createQuery("SELECT e FROM " + getEntityName() + " e", getEntityClass()).getResultList();
        } finally {
            HibernateManager.closeAll();
        }
    }

}
