package uk.sponte.automation.seleniumpom.proxies.handlers;

import uk.sponte.automation.seleniumpom.events.PageFactoryEventListenener;

/**
 * Edited by nihanth on 09/01/19.
 */
public interface Refreshable extends PageFactoryEventListenener {
    void invalidate();
    void refresh();
    void setParent(Refreshable refreshable);
}
