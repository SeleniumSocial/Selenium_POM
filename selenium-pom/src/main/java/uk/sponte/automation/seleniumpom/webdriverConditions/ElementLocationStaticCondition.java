package uk.sponte.automation.seleniumpom.webdriverConditions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ElementLocationStaticCondition implements
        ExpectedCondition<WebElement> {

    private Point location;

    private WebElement element;

    public ElementLocationStaticCondition(WebElement element) {
        this.element = element;
        this.location = element.getLocation();
    }

    @Nullable
    @Override
    public WebElement apply(@Nullable WebDriver webDriver) {
        // give element a chance to start moving;
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Point newLocation = element.getLocation();
        if(!this.location.equals(newLocation)) {
            this.location = newLocation;
            return null;
        }

        return element;
    }
}
