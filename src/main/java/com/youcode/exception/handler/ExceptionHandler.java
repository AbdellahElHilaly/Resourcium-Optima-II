package com.youcode.exception.handler;

import com.youcode.exception.message.ExceptionWrapper;
import com.youcode.libs.print.ObjectPrinter;
import jakarta.persistence.NoResultException;

import org.hibernate.HibernateException;

public class ExceptionHandler extends RuntimeException {

    public ExceptionHandler(Exception e) {
        handle(e);
    }

    private void handle(Exception e) {
        if (e.getCause() instanceof HibernateException) {
            ObjectPrinter.errorJson(new ExceptionWrapper(e)
                            .status(500)
                            .error("Internal Server Error")
                            .message(e.getCause().getMessage())
                    , "error");
        } else if (e instanceof NoResultException) {
            ObjectPrinter.errorJson(new ExceptionWrapper(e)
                            .status(404)
                            .error("Not Found")
                            .message(e.getMessage())
                    , "error");
        } else {
            ObjectPrinter.errorJson(new ExceptionWrapper(e)
                            .status(500)
                            .error("Internal Server Error")
                            .message(e.getMessage())
                    , "error");

        }
    }
}

