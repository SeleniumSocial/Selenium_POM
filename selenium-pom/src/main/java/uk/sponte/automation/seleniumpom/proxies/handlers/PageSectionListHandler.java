package uk.sponte.automation.seleniumpom.proxies.handlers;

import com.google.inject.Provider;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import uk.sponte.automation.seleniumpom.PageElementImpl;
import uk.sponte.automation.seleniumpom.PageFactory;
import uk.sponte.automation.seleniumpom.PageSection;
import uk.sponte.automation.seleniumpom.configuration.Constants;
import uk.sponte.automation.seleniumpom.dependencies.DependencyInjector;
import uk.sponte.automation.seleniumpom.helpers.FrameWrapper;
import uk.sponte.automation.seleniumpom.helpers.ReflectionHelper;
import uk.sponte.automation.seleniumpom.orchestration.WebDriverFrameSwitchingOrchestrator;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Invocation handler for page section lists
  * Edited by nihanth on 09/01/19.
 */
public class PageSectionListHandler
        implements InvocationHandler, Refreshable {
    private DependencyInjector driver;

    private SearchContext searchContext;

    private By by;

    private Type pageSectionType;

    private Provider<PageFactory> pageFactory;

    private FrameWrapper frame;

    private WebDriverFrameSwitchingOrchestrator webDriverOrchestrator;

    private ArrayList<Object> pageSections;

    private Refreshable parent;
    private boolean needsRefresh;

    public PageSectionListHandler(
            DependencyInjector driver,
            SearchContext searchContext,
            By by,
            Type pageSectionType,
            Provider<PageFactory> pageFactory,
            FrameWrapper frame,
            WebDriverFrameSwitchingOrchestrator webDriverOrchestrator) {
        this.driver = driver;
        this.searchContext = searchContext;
        this.by = by;
        this.pageSectionType = pageSectionType;
        this.pageFactory = pageFactory;
        this.frame = frame;
        this.webDriverOrchestrator = webDriverOrchestrator;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        if (pageSections == null) {
            List<WebElement> elements = searchContext.findElements(by);

            pageSections = new ArrayList<Object>();
            for (WebElement element : elements) {

                Object pageSection = getPageSection(element);
                pageSections.add(pageSection);
            }
        }

        if(needsRefresh) {
            this.refresh();
        }

        return method.invoke(pageSections, args);
    }

    private Object getPageSection(WebElement element) {
        PageElementImpl pageElement = getPageElement(element);

        Class<?> pageSectionClass = (Class<?>) this.pageSectionType;
        return pageFactory.get()
                .get(pageSectionClass, pageElement, frame);
    }

    private PageElementImpl getPageElement(WebElement element) {
        WebElement elementProxy = getWebElement(element);

        PageElementImpl pageElement = new PageElementImpl(elementProxy);
        pageElement.setParent(this);
        return pageElement;
    }

    private WebElement getWebElement(WebElement element) {
        WebElementHandler webElementHandler = new WebElementHandler(
                driver, searchContext,
                By.id(Constants.DUMMY_PAGE_LOCATOR_FOR_LISTS), frame,
                webDriverOrchestrator, element);
        webElementHandler.setParent(this);

        return (WebElement) Proxy.newProxyInstance(
                webElementHandler.getClass().getClassLoader(),
                new Class[] { WebElement.class, Locatable.class },
                webElementHandler
        );
    }

    @Override
    public void invalidate() {
        if(pageSections == null) return;

        for (Object pageSection : pageSections) {
            pageFactory.get().invalidate(pageSection);
        }

        this.needsRefresh = true;
    }

    @Override
    public void refresh() {
        needsRefresh = false;
        if(this.parent != null) parent.refresh();

        if(pageSections == null) return;

        List<WebElement> elements = searchContext.findElements(by);
        Field rootElementField = ReflectionHelper
                .getField(PageSection.class,
                        Constants.ROOT_ELEMENT_FIELD_NAME);

        Field webElementField = ReflectionHelper.getField(PageElementImpl.class,
                Constants.PAGE_ELEMENT_CONTAINER_FIELD_NAME);
        webElementField.setAccessible(true);

        Field webElementHandlersWebElementField = ReflectionHelper.getField(WebElementHandler.class,
                Constants.PAGE_ELEMENT_CONTAINER_FIELD_NAME);
        webElementHandlersWebElementField.setAccessible(true);

        assert rootElementField != null;
        rootElementField.setAccessible(true);

        // Remove surplus sections (ones that have been removed from DOM
        while(pageSections.size() > elements.size()) {
            pageSections.remove(pageSections.size() - 1);
        }

        for (int i = 0; i < elements.size(); i++) {
            WebElement e = getWebElement(elements.get(i));
            Object s = pageSections.get(i);

            if (s == null) {
                pageSections.set(i, getPageSection(e));
            } else {
                try {
                    Object rootElement = rootElementField.get(s);
                    Object webElementProxy = webElementField.get(rootElement);
                    if(webElementProxy instanceof Proxy) {
                        InvocationHandler invocationHandler = Proxy
                                .getInvocationHandler(webElementProxy);
                        if(invocationHandler instanceof WebElementHandler) {
                            webElementHandlersWebElementField.set(invocationHandler, e);
                        }
                    }
                    // webElementField.set(rootElement, e);
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override
    public void setParent(Refreshable refreshable) {
        this.parent = refreshable;
    }

    @Override
    public void pageRefreshed(WebDriver driver) {
        invalidate();
    }
}
