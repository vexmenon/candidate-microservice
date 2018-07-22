package com.ripplehire.candidate.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by mahesh on 2/2/17.
 */
public class InvalidUserException extends Exception {
    private String errorCode;
    private String exceptionMsg;

    private static Logger logger = LogManager.getLogger("InvalidUserException");

    public InvalidUserException(String errorCode, String exceptionMsg) {
        this.errorCode = errorCode;
        this.exceptionMsg = exceptionMsg;
    }

    public InvalidUserException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getExceptionMsg(){
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        logger.error("InvalidUserException: Error: " + exceptionMsg);
        this.exceptionMsg = exceptionMsg;
    }
}
