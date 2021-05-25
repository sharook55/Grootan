package com.login.exception;

public class LoginException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LoginException() {
        super();
    }

    public LoginException(ExceptionCode e) {
        super(e.getCode() + " : " + e.getMessage());
    }
}
