package uk.sponte.automation.seleniumpom;

import org.openqa.selenium.SearchContext;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ElementListImpl {

    public ElementListImpl(
            SearchContext searchContext,
            List webElementListProxy) {
    }

    public boolean canHandle(Method method) {
        return false;
    }
}
