package uk.sponte.automation.seleniumpom.proxies.handlers;

import java.lang.reflect.Method;

/**
 * Edited by nihanth on 09/01/19.
 */
public interface DynamicHandler {
    boolean canHandle(Method method);
}
