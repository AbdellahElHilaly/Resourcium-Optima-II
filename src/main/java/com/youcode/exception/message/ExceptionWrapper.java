package com.youcode.exception.message;

public class ExceptionWrapper {
    private int status;
    private String message;
    private String error;
    private String path;
    private int line;
    private String trace;

    private Exception exception;

    public ExceptionWrapper(Exception e) {
        this.exception = e;
        for (StackTraceElement element : e.getStackTrace()) {
            if (element.getClassName().startsWith("org.example")) {
                this.path = element.getClassName();
                this.error = element.getMethodName();
                this.line = element.getLineNumber();
                this.trace = element.toString();
                break;
            }
        }
        this.message = e.getMessage();
    }

    public ExceptionWrapper status(int status) {
        this.status = status;
        return this;
    }

    public ExceptionWrapper message(String message) {
        this.message = message;
        return this;
    }

    public ExceptionWrapper error(String error) {
        this.error = error;
        return this;
    }

}
