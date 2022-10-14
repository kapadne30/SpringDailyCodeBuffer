package com.dailycodebuffer.springboot.tutorial.error;

public class DepartmentNotFoundExaception extends Exception {
    public DepartmentNotFoundExaception() {
        super();
    }

    public DepartmentNotFoundExaception(String message) {
        super(message);
    }

    public DepartmentNotFoundExaception(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFoundExaception(Throwable cause) {
        super(cause);
    }

    protected DepartmentNotFoundExaception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
