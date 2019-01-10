package uk.sponte.automation.seleniumpom.exceptions;

/**
 * Created by nihanth on 08/01/19.
 */
public class RetryException extends RuntimeException {
    public RetryException(Exception exceptionThrown) {
        super(exceptionThrown);
    }
}
