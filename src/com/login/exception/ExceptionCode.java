package com.login.exception;

public enum ExceptionCode {

    FIELD_NOT_NULL("EX001", "Username or Password is not Empty"),
    ENTER_DATA("EX002", "Please Enter Data"),
    CREATION_FAILURE("EX003", "Unable to Create new Login"),
    CONNECTION_FAILED("EX004", "Unable to Establish Connection"),
    CONNECTION_FAILED_TO_CLOSE("EX005", "Unable to Close Connection"), 
    FAILED_TO_COMMIT_OR_ROLLBACK("EX006", "Failed to commit or rollback");

    private String code;
    private String message;

    ExceptionCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
