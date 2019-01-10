package uk.sponte.automation.seleniumpom.guice;

import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.spi.InjectionListener;
import uk.sponte.automation.seleniumpom.PageFactory;

/**
 * Edited by nihanth on 09/01/19.
 */
class PageObjectModelInjectionListener implements InjectionListener {
    private Provider<Injector> injector;

    public PageObjectModelInjectionListener(Provider<Injector> injector) {
        this.injector = injector;
    }

    public void afterInjection(Object page) {
        PageFactory pageFactory = injector.get().getInstance(PageFactory.class);
        pageFactory.get(page);
    }
}
