package uk.sponte.automation.seleniumpom.webdriverConditions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

/**
 * WebDriver element condition for checking element's presence
 * Edited by nihanth on 09/01/19.
 */
public class ElementPresentCondition implements ExpectedCondition<WebElement> {
    private WebElement element;

    public ElementPresentCondition(WebElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public WebElement apply(@Nullable WebDriver webDriver) {
        try {
            element.getTagName();
            return element;
        } catch (NoSuchElementException ex) {
            return null;
        } catch(StaleElementReferenceException ex) {
            return null;
        }
    }
}
