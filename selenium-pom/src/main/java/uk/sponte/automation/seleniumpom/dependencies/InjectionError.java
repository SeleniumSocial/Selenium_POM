package uk.sponte.automation.seleniumpom.dependencies;

/**
 * Used to throw errors during dependency injection process.
 * Created by nihanth on 07/01/19.
 */
public class InjectionError extends Error {
    public InjectionError(Throwable cause) {
        super(cause);
    }

    public InjectionError(String message) {
        super(message);
    }
}
