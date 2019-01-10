package uk.sponte.automation.seleniumpom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;
import uk.sponte.automation.seleniumpom.proxies.handlers.DynamicHandler;
import uk.sponte.automation.seleniumpom.proxies.handlers.Refreshable;

/**
 * Edited by nihanth on 09/01/19.
 */
public interface PageElement extends WebElement, Locatable, WebElementExtensions, WrapsElement, SearchContext, DynamicHandler,
        Refreshable {
}
