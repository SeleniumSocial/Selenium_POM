package uk.sponte.automation.seleniumpom.webdriverConditions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ElementLocationMovingCondition implements
        ExpectedCondition<WebElement> {

    private Point location;

    private WebElement element;

    public ElementLocationMovingCondition(WebElement element) {
        this.element = element;
        this.location = element.getLocation();
    }

    @Nullable
    @Override
    public WebElement apply(@Nullable WebDriver webDriver) {
        Point newLocation = element.getLocation();
        if(this.location.equals(newLocation)) {
            this.location = newLocation;
            return null;
        }

        return element;
    }
}
