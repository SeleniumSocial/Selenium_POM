package uk.sponte.automation.seleniumpom.proxies.handlers;

import uk.sponte.automation.seleniumpom.PageElementImpl;
import uk.sponte.automation.seleniumpom.helpers.FrameWrapper;
import uk.sponte.automation.seleniumpom.orchestration.WebDriverFrameSwitchingOrchestrator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * Edited by nihanth on 09/01/19.
 */
public class PageElementHandler implements InvocationHandler {
    private static final Logger LOG = Logger.getLogger(PageElementHandler.class.getName());

    private PageElementImpl pageElement;
    private FrameWrapper frame;
    private WebDriverFrameSwitchingOrchestrator webDriverOrchestrator;

    public Object invoke(Object proxy, final Method method, final Object[] args) throws Throwable {
        try {
            webDriverOrchestrator.useFrame(this.frame);

            if (pageElement.canHandle(method)) {
                return method.invoke(pageElement, args);
            }

            return method.invoke(proxy, args);

        } catch (InvocationTargetException exception) {
            throw exception.getCause();
        }
    }
}
