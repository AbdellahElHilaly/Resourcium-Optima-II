package com.youcode.exception.handler;


import com.youcode.exception.message.ExceptionWrapper;
import com.youcode.libs.print.ObjectPrinter;
import org.hibernate.HibernateException;

public class ExceptionHandler extends RuntimeException {

    public ExceptionHandler(Exception e) {
        handle(e);
    }

    private void handle(Exception e) {
        if (e.getCause() instanceof HibernateException) {
            ObjectPrinter.json(new ExceptionWrapper(e)
                            .status(500)
                            .error("Database Error")
                            .message(e.getCause().getMessage())
                    , "error");
        }
    }
}

