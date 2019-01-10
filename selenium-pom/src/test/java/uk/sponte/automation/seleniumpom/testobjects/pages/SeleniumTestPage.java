package uk.sponte.automation.seleniumpom.testobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
  * Selenium test page
 */
public class SeleniumTestPage {
    @FindBy(tagName = "h1")
    public WebElement headline;

    @FindBy(className = "item")
    public List<WebElement> listPageElements;
}
