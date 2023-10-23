package com.youcode.utils.db.dao;

import com.youcode.exception.handler.ExceptionHandler;
import com.youcode.libs.print.Printer;
import com.youcode.utils.db.Manager.HibernateManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import lombok.var;


import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface JpaRepository<T> {

    EntityManager entityManager = HibernateManager.getEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    Class<T> getEntityClass();

    default String getEntityName() {
        return getEntityClass().getSimpleName();
    }

    public default T save(T t) {
        HibernateManager.openAll();
        try {
            transaction.begin();
            entityManager.persist(t);
            transaction.commit();
            return t;
        } catch (Exception e) {
            new ExceptionHandler(e);
            return null;
        } finally {
            HibernateManager.closeAll();
        }

    }


    public default T update(T t) {
        HibernateManager.openAll();
        try {
            transaction.begin();
            entityManager.merge(t);
            transaction.commit();
            return t;
        } catch (Exception e) {
            new ExceptionHandler(e);
            return null;
        } finally {
            HibernateManager.closeAll();
        }
    }

    public default void delete(T t) {
        HibernateManager.openAll();
        try {
            transaction.begin();
            entityManager.remove(t);
            transaction.commit();
        }catch (Exception e) {
            new ExceptionHandler(e);
        }
        finally {
            HibernateManager.closeAll();
        }
    }

    public default T findById(Long id) {
        HibernateManager.openAll();
        try {
            return entityManager.find(getEntityClass(), id);
        } catch (Exception e) {
            new ExceptionHandler(e);
            return null;
        } finally {
            HibernateManager.closeAll();
        }
    }


    public default List<T> selectAll() {
        HibernateManager.openAll();
        try {
            return entityManager.createQuery("SELECT e FROM " + getEntityName() + " e", getEntityClass()).getResultList();
        } catch (Exception e) {
            new ExceptionHandler(e);
            return null;
        } finally {
            HibernateManager.closeAll();
        }
    }

    public default List<T> findCollectionBy(Map<String, Object> columns) {
        HibernateManager.openAll();
        try {
            String query = "SELECT e FROM " + getEntityName() + " e WHERE ";
            for (String column : columns.keySet()) {
                query += "e." + column + " = :" + column + " AND ";
            }
            query = query.substring(0, query.length() - 4);
            var query1 = entityManager.createQuery(query, getEntityClass());
            for (String column : columns.keySet()) {
                query1.setParameter(column, columns.get(column));
            }
            return query1.getResultList();
        } catch (Exception e) {
            new ExceptionHandler(e);
            return Collections.emptyList();
        } finally {
            HibernateManager.closeAll();
        }
    }


    public default T findBy(Map<String, Object> columns) {
        HibernateManager.openAll();
        try {
            StringBuilder query = new StringBuilder("SELECT e FROM " + getEntityName() + " e WHERE ");
            for (String column : columns.keySet()) {
                query.append("e.").append(column).append(" = :").append(column).append(" AND ");
            }
            query = new StringBuilder(query.substring(0, query.length() - 4));
            var query1 = entityManager.createQuery(query.toString(), getEntityClass());
            for (String column : columns.keySet()) {
                query1.setParameter(column, columns.get(column));
            }

            try {
                return (T) query1.getSingleResult();
            } catch (NoResultException e) {
                new ExceptionHandler(e);
                Printer.warning("No result found for " + getEntityName() + " with " + columns.toString());
                return null;
            } catch (Exception e) {
                new ExceptionHandler(e);
                Printer.error("Error while finding " + getEntityName() + " with " + columns.toString());
                return null;
            }
        } finally {
            HibernateManager.closeAll();
        }
    }


}
